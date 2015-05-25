package com.android.catalogo.asynctasks;

import android.app.ProgressDialog;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.android.catalogo.R;
import com.android.catalogo.fragments.CategoriasFragment;
import com.android.catalogo.model.Categoria;
import com.android.catalogo.utilities.Constantes;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;

import java.util.List;

/**
 * Catalogo de la Empresa
 */
public class CatalogoAsyncTask extends AsyncTask<Void, Void, List<Categoria>> {

    private static final String URL_GET_CATALOGO = Constantes.URL_SERVER + "/catalogo";
    private static final String TAG = "CatalogoAsyncTask";
    int response;
    ProgressDialog progressDialog;
    AndroidHttpClient androidHttpClient = AndroidHttpClient.newInstance("");
    CategoriasFragment categoriasFragment;

    public CatalogoAsyncTask(CategoriasFragment categoriasFragment) {
        this.categoriasFragment = categoriasFragment;
        progressDialog = new ProgressDialog(this.categoriasFragment.getActivity());
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        HttpConnectionParams.setConnectionTimeout(androidHttpClient.getParams(), Constantes.TIME_OUT_CONNECTION);
        HttpConnectionParams.setSoTimeout(androidHttpClient.getParams(), Constantes.TIME_OUT_SOCKET);
        response = Constantes.FAIL;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog.setMessage(categoriasFragment.getString(R.string.cargando));
        progressDialog.show();
    }

    @Override
    protected List<Categoria> doInBackground(Void... objects) {
        try {
            HttpGet httpGet = new HttpGet(URL_GET_CATALOGO);
            JSONResponseHandler responseHandler = new JSONResponseHandler();
            return androidHttpClient.execute(httpGet, responseHandler);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            e.printStackTrace();
        }
        return null;

    }

    @Override
    protected void onPostExecute(List<Categoria> catalogo) {
        if (progressDialog != null) {
            if (progressDialog.isShowing())
                progressDialog.dismiss();
        }
        switch (response) {
            case Constantes.SUCCESS:
                categoriasFragment.cargarInterfazGrafica(catalogo);
                break;
            case Constantes.FAIL:
                Toast.makeText(categoriasFragment.getActivity(), R.string.server_error, Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(categoriasFragment.getActivity(), R.string.server_error, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private class JSONResponseHandler implements ResponseHandler<List<Categoria>> {

        @Override
        public List<Categoria> handleResponse(HttpResponse response) {
            try {
                CatalogoAsyncTask.this.response = response.getStatusLine().getStatusCode();
                if (CatalogoAsyncTask.this.response == Constantes.SUCCESS) {
                    String jsonResponse = new BasicResponseHandler().handleResponse(response);
                    JSONArray jsonArray = new JSONArray(jsonResponse);
                    return Categoria.jsonToCatalogo(jsonArray.getJSONObject(0));
                }
            } catch (Exception e) {
                Log.e(TAG, e.toString());
                e.printStackTrace();
            } finally {
                closeConnection();
            }

            return null;
        }

        private void closeConnection() {
            try {
                if (androidHttpClient != null)
                    androidHttpClient.close();
            } catch (Exception e) {
                Log.e(TAG, e.toString());
                e.printStackTrace();
            }
        }
    }

}


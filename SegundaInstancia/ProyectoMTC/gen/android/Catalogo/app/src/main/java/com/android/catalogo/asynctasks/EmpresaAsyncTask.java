package com.android.catalogo.asynctasks;

import android.app.ProgressDialog;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.android.catalogo.R;
import com.android.catalogo.fragments.AcercaDeFragment;
import com.android.catalogo.model.Empresa;
import com.android.catalogo.utilities.Constantes;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;

/**
 * Empresa que ofrece el catálogo
 */
public class EmpresaAsyncTask extends AsyncTask<Void, Void, Empresa> {

    private static final String URL_GET_EMPRESA = Constantes.URL_SERVER + "/empresa";
    private static final String TAG = "EmpresaAsyncTask";
    int response;
    ProgressDialog progressDialog;
    AndroidHttpClient androidHttpClient = AndroidHttpClient.newInstance("");
    AcercaDeFragment acercaDeFragment;

    public EmpresaAsyncTask(AcercaDeFragment acercaDeFragment) {
        this.acercaDeFragment = acercaDeFragment;
        progressDialog = new ProgressDialog(this.acercaDeFragment.getActivity());
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        HttpConnectionParams.setConnectionTimeout(androidHttpClient.getParams(), Constantes.TIME_OUT_CONNECTION);
        HttpConnectionParams.setSoTimeout(androidHttpClient.getParams(), Constantes.TIME_OUT_SOCKET);
        response = Constantes.FAIL;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog.setMessage(acercaDeFragment.getString(R.string.cargando));
        progressDialog.show();
    }

    @Override
    protected Empresa doInBackground(Void... objects) {
        try {
            HttpGet httpGet = new HttpGet(URL_GET_EMPRESA);
            JSONResponseHandler responseHandler = new JSONResponseHandler();
            return androidHttpClient.execute(httpGet, responseHandler);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            e.printStackTrace();
        }
        return null;

    }

    @Override
    protected void onPostExecute(Empresa empresa) {
        if (progressDialog != null) {
            if (progressDialog.isShowing())
                progressDialog.dismiss();
        }
        switch (response) {
            case Constantes.SUCCESS:
                acercaDeFragment.cargarInterfazGrafica(empresa);
                break;
            case Constantes.FAIL:
                Toast.makeText(acercaDeFragment.getActivity(), R.string.server_error, Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(acercaDeFragment.getActivity(), R.string.server_error, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private class JSONResponseHandler implements ResponseHandler<Empresa> {

        @Override
        public Empresa handleResponse(HttpResponse response) {
            try {
                EmpresaAsyncTask.this.response = response.getStatusLine().getStatusCode();
                if (EmpresaAsyncTask.this.response == Constantes.SUCCESS) {
                    String jsonResponse = new BasicResponseHandler().handleResponse(response);
                    JSONArray jsonArray = new JSONArray(jsonResponse);
                    return Empresa.jsonToEmpresa(jsonArray.getJSONObject(0));
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


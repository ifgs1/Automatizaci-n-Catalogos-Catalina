package com.android.catalogo.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.catalogo.R;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Utilidades transversales a la aplicación
 */
public class Utilities {

    public static final Typeface TYPEFACE = Typeface.defaultFromStyle(Typeface.NORMAL);
    private static final String COLOR_LETRA = "#3F51B5";

    public static final int GROUPING_SIZE = 3;
    public static final char COLOMBIA_GROUPING_SEPARATOR = '.';
    public static final char COLOMBIA_MONEY_SYMBOL = '$';


    public static void hideKeyBoard(Activity context) {
        context.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
    public static String doubleToMoneyFormat(double price) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(COLOMBIA_GROUPING_SEPARATOR);

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        decimalFormat.setGroupingSize(GROUPING_SIZE);

        return COLOMBIA_MONEY_SYMBOL + " " + decimalFormat.format(price);
    }

    public static void replaceFragment(FragmentManager fragmentManager, Fragment fragment, int frameLayoutResource) {
        try {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(frameLayoutResource, fragment);
            fragmentTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cargarLetra(Context context,TextView textView){
        textView.setTypeface(TYPEFACE);
        textView.setTextColor(Color.parseColor(COLOR_LETRA));
        textView.setTextSize(context.getResources().getDimension(R.dimen.tamano_letra));
    }
}

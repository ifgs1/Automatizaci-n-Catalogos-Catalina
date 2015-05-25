package com.android.catalogo.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.android.catalogo.utilities.Utilities;

/**
 * Base Activity con configuración compartida por todas las actividades
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utilities.hideKeyBoard(this);
    }
}


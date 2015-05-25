package com.android.catalogo.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.android.catalogo.R;
import com.android.catalogo.fragments.AcercaDeFragment;
import com.android.catalogo.fragments.CategoriasFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Controla los fragmentos de categorías y contacto del catálogo de la empresa
 */
public class CatalogoActivity extends BaseActivity {

    List<Fragment> fragments;
    ViewPager viewPager;
    CatalogoPagerAdapter catalogoPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogo_activity);
        cargarFragments();
        cargarNavigationTabs();
    }

    private void cargarFragments() {
        fragments = new ArrayList<>();
        fragments.add(new CategoriasFragment());
        fragments.add(new AcercaDeFragment());
    }

    private void cargarNavigationTabs() {
        catalogoPagerAdapter = new CatalogoPagerAdapter(getSupportFragmentManager(), this);
        viewPager = (ViewPager) findViewById(R.id.Catalogo_ViewPager);
        viewPager.setAdapter(catalogoPagerAdapter);
    }

    class CatalogoPagerAdapter extends FragmentPagerAdapter {

        Context context;
        int[] stringTitles = {R.string.view_pager_categorias, R.string.view_pager_acerca_de};

        public CatalogoPagerAdapter(FragmentManager fragmentManager, Context context) {
            super(fragmentManager);
            this.context = context;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getString(stringTitles[position]);
        }
    }
}

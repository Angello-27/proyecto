package com.uagrm.developsoft6.easyfood.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.megamil.restaurante.R;

public class BannerPlatosFragment extends android.support.v4.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_banner_platos, container, false);
        return view;
    }



}

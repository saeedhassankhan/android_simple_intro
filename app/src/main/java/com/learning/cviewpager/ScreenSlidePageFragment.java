package com.learning.cviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ScreenSlidePageFragment extends Fragment {

    public static  ScreenSlidePageFragment getInstance(String backgroundColor  , int desc , int iconRes){
        ScreenSlidePageFragment frag = new ScreenSlidePageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("color" ,  backgroundColor);
        bundle.putInt("desc" , desc);
        bundle.putInt("icon" , iconRes);
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.activity_screen_slides, container, false);


        TextView txt = rootView.findViewById(R.id.txt);
        ImageView img = rootView.findViewById(R.id.imgIcon);
        LinearLayout lytRoot = rootView.findViewById(R.id.root);


        String col = getArguments().getString("color" , "#ffffff");
        int iconRes = getArguments().getInt("icon");
        int desc = getArguments().getInt("desc");


        img.setImageResource(iconRes);
        txt.setText(desc);
        lytRoot.setBackgroundColor(Color.parseColor(col));

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





    }
}

package com.example.apporderfood.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.apporderfood.R;


public class FavoriteFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.favorite_fragment,container, false);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
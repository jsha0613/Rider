package com.example.rider.ui.bike;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.rider.R;

public class BikeFragment extends Fragment {

    private BikeViewModel bikeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bikeViewModel =
                ViewModelProviders.of(this).get(BikeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bike, container, false);
        final TextView textView = root.findViewById(R.id.text_bike);
        bikeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

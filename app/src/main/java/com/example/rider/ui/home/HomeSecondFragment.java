package com.example.rider.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.rider.R;

public class HomeSecondFragment extends Fragment {

    private HomeSecondViewModel homesecondViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homesecondViewModel =
                ViewModelProviders.of(this).get(HomeSecondViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_second, container, false);


        return root;
    }
}

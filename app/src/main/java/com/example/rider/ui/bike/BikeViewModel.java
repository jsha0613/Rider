package com.example.rider.ui.bike;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BikeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BikeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bike fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
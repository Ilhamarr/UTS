package com.example.counterandroid.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Integer> mText;
    int count=0;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(0);
    }

    public LiveData<Integer> getText() {
        return mText;
    }

    private void pluscounter() {
        mText.setValue(count++);
    }

    private void resetcounter() {
        mText.setValue(count);
    }

    private void minuscounter() {
        mText.setValue(count--);
    }

}
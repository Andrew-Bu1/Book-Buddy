package com.example.bookbuddy.ui.borrowed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BorrowedViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BorrowedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
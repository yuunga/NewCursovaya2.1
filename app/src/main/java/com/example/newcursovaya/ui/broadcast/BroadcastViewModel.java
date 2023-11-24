package com.example.newcursovaya.ui.broadcast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BroadcastViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BroadcastViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Тут будет страница передачи");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
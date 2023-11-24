package com.example.newcursovaya.ui.recording;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecordingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RecordingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Тут будет страница записи");
}

    public LiveData<String> getText() {
        return mText;
    }
}
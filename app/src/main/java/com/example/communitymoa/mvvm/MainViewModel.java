package com.example.communitymoa.mvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.communitymoa.model.Moa;
import com.example.communitymoa.model.MoaRepository;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private MoaRepository moaRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        moaRepository = new MoaRepository(application);
    }

    public LiveData<List<Moa>> getAllMoa() {
        return moaRepository.getMutableLiveData();
    }
}




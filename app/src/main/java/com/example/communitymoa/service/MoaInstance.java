package com.example.communitymoa.service;

import com.example.communitymoa.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoaInstance {
    private static Retrofit retrofit;

    public static MoaService getInstance(){
        if(retrofit ==null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl("http://communitymoa.com/api/moa/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(MoaService.class);
    }
}


package com.example.communitymoa.service;

import com.example.communitymoa.model.Moa;
import com.example.communitymoa.model.PostData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MoaService {
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @POST("communityList")
    Call<List<Moa>> getMoaList2(@Body PostData postData);

    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @FormUrlEncoded
    @POST("communityList")
    Call<List<Moa>> getMoaList(@FieldMap HashMap<String, Object> param);


}




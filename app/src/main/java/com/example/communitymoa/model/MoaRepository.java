package com.example.communitymoa.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.example.communitymoa.service.MoaInstance;
import com.example.communitymoa.service.MoaService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MoaRepository {
    private List<Moa> moaList = new ArrayList<Moa>();
    MutableLiveData<List<Moa>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public MoaRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Moa>> getMutableLiveData(){
        MoaService service = MoaInstance.getInstance();
        HashMap map = new HashMap();
        map.put("pageno", 1);
        map.put("preview", "fixed");
        map.put("searchPeriod", 3);
        map.put("seq_num", 0);
        map.put("searchOrder ", "popular");
        map.put("searchType", "y");
        map.put("searchSource", "todayhumor");

        PostData postData = PostData.builder().pageno(1)
                .preview("fixed")
                .searchPeriod(3)
                .seq_num(0)
                .searchOrder("popular")
                .searchType("y")
                .searchSource("todayhumor")
                .build();

        Call<List<Moa>> call = service.getMoaList(map);

        call.enqueue(new Callback<List<Moa>>() {
            @Override
            public void onResponse(Call<List<Moa>> call, Response<List<Moa>> response) {
                moaList = response.body();
                System.out.println( " response : " + moaList.size());
                for (Moa moa: moaList
                     ) {
                    System.out.println(":___________________===>" + moa.toString());
                }
                mutableLiveData.setValue(moaList);
            }

            @Override
            public void onFailure(Call<List<Moa>> call, Throwable t) {

            }
        });
        return mutableLiveData;
    }
}

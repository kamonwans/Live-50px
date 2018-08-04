package com.example.liuyao.lab.manager.http;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST("list")
    Call<Object> loadPhotoList();


}

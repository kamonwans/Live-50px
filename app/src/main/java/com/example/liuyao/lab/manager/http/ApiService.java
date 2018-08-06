package com.example.liuyao.lab.manager.http;

import com.example.liuyao.lab.dao.PhotoItemCollectioDao;

import retrofit2.Call;
import retrofit2.http.POST;


public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectioDao> loadPhotoList();


}

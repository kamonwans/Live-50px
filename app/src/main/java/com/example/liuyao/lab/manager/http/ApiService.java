package com.example.liuyao.lab.manager.http;

import com.example.liuyao.lab.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;


public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();


}

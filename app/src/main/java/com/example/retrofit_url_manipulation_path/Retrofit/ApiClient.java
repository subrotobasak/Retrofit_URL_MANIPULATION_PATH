package com.example.retrofit_url_manipulation_path.Retrofit;

import com.example.retrofit_url_manipulation_path.Interface.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static ApiClient apiClient;
    private static Retrofit retrofit;


    //Constructor Instance
    public ApiClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiClient getInstance() {
        if (apiClient == null) {
            apiClient = new ApiClient();
        }
        return apiClient;
    }

    public ApiInterface getApi() {
        return retrofit.create(ApiInterface.class);
    }
}

// This mechanism all time same for all projects, just "BASE_URL" will be changed.

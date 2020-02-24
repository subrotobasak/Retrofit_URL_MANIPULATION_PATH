package com.example.retrofit_url_manipulation_path.Interface;

import com.example.retrofit_url_manipulation_path.Model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    // Use @PATH

    @GET("posts/{id}/comments")
    Call<List<Model>> getComments (@Path("id") int postId);
}

package com.bignerdranch.android.javamvvmexample.retrofit;

import static com.bignerdranch.android.javamvvmexample.constants.AppConstant.API_KEY;

import com.bignerdranch.android.javamvvmexample.response.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("top-headlines?country=us&category=business&apiKey="+API_KEY)
    Call<ArticleResponse> getTopHeadlines();
}

package com.bignerdranch.android.javamvvmexample.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.bignerdranch.android.javamvvmexample.repository.ArticleRepository;
import com.bignerdranch.android.javamvvmexample.response.ArticleResponse;

public class ArticleViewModel extends AndroidViewModel {

    private ArticleRepository articleRepository;
    private LiveData<ArticleResponse> articleResponseLiveData;

    public ArticleViewModel(@NonNull Application application) {
        super(application);

        articleRepository = new ArticleRepository();
        this.articleResponseLiveData = articleRepository.getDashBoardNews();
    }

    public LiveData<ArticleResponse> getBashboardNewsResponseLiveData() {
        return articleResponseLiveData;
    }
}

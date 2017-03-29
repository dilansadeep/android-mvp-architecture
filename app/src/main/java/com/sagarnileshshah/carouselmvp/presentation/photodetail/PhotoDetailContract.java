package com.sagarnileshshah.carouselmvp.presentation.photodetail;

import android.content.Context;

import com.sagarnileshshah.carouselmvp.data.models.comment.Comment;
import com.sagarnileshshah.carouselmvp.data.models.photo.Photo;
import com.sagarnileshshah.carouselmvp.util.mvp.BaseView;
import com.sagarnileshshah.carouselmvp.util.mvp.IBasePresenter;
import com.sagarnileshshah.carouselmvp.util.mvp.IBaseView;

import java.util.List;

interface PhotoDetailContract {

    interface View extends IBaseView {

        void showPhoto(Photo photo);

        void showComments(List<Comment> comments);
    }

    interface Presenter extends IBasePresenter<View> {

        void getComments(Context context, Photo photo);
    }
}
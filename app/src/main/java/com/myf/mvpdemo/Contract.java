package com.myf.mvpdemo;


/**
 * Created by MaoYouFeng on 2016/5/26.
 */
public interface Contract {
    public interface View{
        void renderContent(String data);
    }

    public interface Presenter{
        void attachView(View view);
        void detachView();

        void getData();
        void putData(String data);
    }
}

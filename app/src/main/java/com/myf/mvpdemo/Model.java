package com.myf.mvpdemo;

/**
 * Created by MaoYouFeng on 2016/5/26.
 */
public class Model {

    String data;
    public String getData(){
        return "model data-->"+data;
    }

    public void putData(String data){
        this.data=data;
    }
}

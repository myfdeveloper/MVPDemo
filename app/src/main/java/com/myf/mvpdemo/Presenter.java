package com.myf.mvpdemo;

/**
 * Created by MaoYouFeng on 2016/5/26.
 */
public class Presenter implements Contract.Presenter{

    private Contract.View mView;
    private Model model=new Model();

    @Override
    public void attachView(Contract.View view) {
        mView=view;
    }

    @Override
    public void detachView() {
        //释放动作
    }

    @Override
    public void getData() {
        String data=model.getData();
        data+=" by presenter";
        mView.renderContent(data);
    }

    @Override
    public void putData(String data) {
        data+=" add logic";
        model.putData(data);
    }
}

package com.myf.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements Contract.View{

    Contract.Presenter mPresenter=new Presenter();
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.attachView(this);
        mTextView= (TextView) findViewById(R.id.showtext);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.get:
                mPresenter.getData();
                break;
            case R.id.set:
                mPresenter.putData("set data");
                break;
        }
    }

    @Override
    public void renderContent(String data) {
        mTextView.setText(data);
    }
}

package com.dcoker.networkdetial;

import android.app.Application;

/**
 * Created by Mr.Zhang on 2017/6/27.
 */

public class Myapplication extends Application {


 private static Myapplication myinstance;


    @Override
    public void onCreate() {
        super.onCreate();
        myinstance=this;
    }

    public static Myapplication getInstance(){

        return myinstance;
    }

}

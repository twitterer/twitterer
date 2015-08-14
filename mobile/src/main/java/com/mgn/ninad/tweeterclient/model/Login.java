package com.mgn.ninad.tweeterclient.model;


import android.databinding.Bindable;
import android.databinding.BaseObservable;

import com.mgn.ninad.tweeterclient.BR;

public class Login extends BaseObservable{

    private String userName;
    private String password;

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

        notifyPropertyChanged(BR.userName);

    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);

    }

}
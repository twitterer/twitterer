package com.mgn.ninad.tweeterclient.model;


import android.databinding.Bindable;
import android.databinding.BaseObservable;

public class Login extends BaseObservable{

    private String userName;
    private String password;

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(com.mgn.ninad.tweeterclient.model.BR.userName);

    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(com.mgn.ninad.tweeterclient.model.BR.password);

    }

}
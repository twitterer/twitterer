package com.mgn.ninad.tweeterclient.model;


import android.databinding.Bindable;
import android.databinding.BaseObservable;

public class Login extends BaseObservable{

    private string userName;
    private string password;

    @Bindable
    public string getUserName() {
        return userName;
    }

    public void setUserName(string userName) {
        this.userName = userName;
        notifyPropertyChanged(com.mgn.ninad.tweeterclient.model.BR.userName);

    }

    @Bindable
    public string getPassword() {
        return password;
    }

    public void setPassword(string password) {
        this.password = password;
        notifyPropertyChanged(com.mgn.ninad.tweeterclient.model.BR.password);

    }

}
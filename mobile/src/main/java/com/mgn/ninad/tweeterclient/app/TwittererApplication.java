package com.mgn.ninad.tweeterclient.app;

import android.app.Application;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by ninad on 02-07-2015.
 */
public class TwittererApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey("WNYm80lEX24hPc5RYIYkvlQsy");
        cb.setOAuthConsumerSecret("6fvwch8SCCLr68GJsv0XsAko9KOHl5dDAXzAtQVPduSUo5Iwdd");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

    }



}

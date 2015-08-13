package com.mgn.ninad.tweeterclient.constants;

/**
 * Created by M1015275 on 8/13/2015.
 */
public class AppConstant {

    /**
     * Register your here app https://dev.twitter.com/apps/new and get your
     * consumer key and secret
     * */
    static String TWITTER_CONSUMER_KEY = "WmfIIk0UvOXdH1zTklE7x9LRy";
    static String TWITTER_CONSUMER_SECRET = "K9OoWZueCqQC7Q4rrMd6YRa2kWM0EoJlMIcJCGpEKD0ut41ZKT";

    // Preference Constants
    static String PREFERENCE_NAME = "twitter_oauth";
    static final String PREF_KEY_OAUTH_TOKEN = "oauth_token";
    static final String PREF_KEY_OAUTH_SECRET = "oauth_token_secret";
    static final String PREF_KEY_TWITTER_LOGIN = "isTwitterLogedIn";

    static final String TWITTER_CALLBACK_URL = "oauth://t4jsample";

    // Twitter oauth urls
    static final String URL_TWITTER_AUTH = "auth_url";
    static final String URL_TWITTER_OAUTH_VERIFIER = "oauth_verifier";
    static final String URL_TWITTER_OAUTH_TOKEN = "oauth_token";
}

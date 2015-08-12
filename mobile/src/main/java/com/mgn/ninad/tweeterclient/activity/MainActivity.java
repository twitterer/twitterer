package com.mgn.ninad.tweeterclient.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.mgn.ninad.tweeterclient.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    private void init()
    {
        if(isFirstOpening())
        {
            
        }
        if(!hasAccesstoken()){
            moveToLogin();
        }
        
    }

    /**
     * Shows the login activity
     */
    private void moveToLogin() {
    }

    /**check for the twitter access token
     *
     * @return true if accesstoen is avaliable, else false
     */
    private boolean hasAccesstoken() {
        return false;
    }

    /**if the app is being oopend for the first time so we can show a
     * quick intro of app
     *
     * @return true ig the app is open for the first time else false
     */
    private boolean isFirstOpening() {
        return false;
    }


}

package xyz.camiloarguello.chatrealtime.ui.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_NS = 2000;
    private Handler mHandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                if(FirebaseAuth.getInstance().getCurrentUser() != null){
                    UserListingActivity.startActivity(SplashActivity.this);
                }else{
                    LoginActivity.startIntent(SplashActivity.this);
                }
                finish();
            }
        };
    }

}

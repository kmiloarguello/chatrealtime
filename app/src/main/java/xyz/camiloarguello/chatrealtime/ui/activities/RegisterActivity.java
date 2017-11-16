package xyz.camiloarguello.chatrealtime.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;

/**
 * Created by Camilo Arguello R on 2017-11-16.
 */

public class RegisterActivity {
    private Toolbar mToolbar;

    public static void startActivity(Context context){
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_register);
        bindViews();
        init();
    }
    private void bindViews(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void init(){
        setSupportActionBar(mToolbar);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_register, RegisterFragment.newInstance(), RegisterFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }

}

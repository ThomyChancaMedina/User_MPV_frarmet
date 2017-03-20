package com.example.thomychanca.finalthomy.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.thomychanca.finalthomy.R;
import com.example.thomychanca.finalthomy.ui.login.LoginActivity;
import com.felipecsl.gifimageview.library.GifImageView;
import android.os.Handler;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class SplashActivity extends AppCompatActivity {
    private GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

        gifImageView=(GifImageView)findViewById(R.id.splashGif);

        try {
            InputStream inputStream=getAssets().open("giphy.gif");
            byte[]bytes=IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();

        }catch (IOException e){

        }

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                SplashActivity.this.startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        },2800);

    }
}

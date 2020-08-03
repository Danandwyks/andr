package com.example.dinas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splashAcivity extends AppCompatActivity {
    private int waktu_loading=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_acivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(splashAcivity.this,Welcome_Activity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
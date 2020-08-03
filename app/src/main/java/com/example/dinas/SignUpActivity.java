package com.example.dinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    EditText password,phone,email,namalengkap,nik;
    TextView login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        namalengkap = (EditText) findViewById(R.id.namalengkap);
        password = (EditText)findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        nik = (EditText) findViewById(R.id.nik);
        phone = (EditText) findViewById(R.id.phone);
        login = (TextView)findViewById(R.id.login);
        signup = (TextView)findViewById(R.id.signup);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(it);
            }
        });
    }
}
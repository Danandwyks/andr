package com.example.dinas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText namalengkap,password;
    TextView login,signup,bytes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        namalengkap = (EditText) findViewById(R.id.namalengkap);
        password = (EditText)findViewById(R.id.password);
        login = (TextView)findViewById(R.id.login);
        signup = (TextView)findViewById(R.id.signup);
        bytes = (TextView)findViewById(R.id.bytes);
        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(it);
            }
        });
    }

    public void login(View view) {
        Intent it = new Intent(LoginActivity.this,DashboardActivity.class);
        startActivity(it);
    }
}
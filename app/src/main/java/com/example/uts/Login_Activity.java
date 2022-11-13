package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void imageView17(View view) {
        Intent intent = new Intent(Login_Activity.this,MainActivity.class);
        startActivity(intent);
    }

    public void textView4(View view) {
        Intent intent = new Intent(Login_Activity.this,Daftar_Activity.class);
        startActivity(intent);
    }
}
package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Daftar_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
    }

    public void imageView8(View view) {
        Intent intent = new Intent(Daftar_Activity.this,MainActivity.class);
        startActivity(intent);
    }

    public void textView2(View view) {
        Intent intent = new Intent(Daftar_Activity.this,Login_Activity.class);
        startActivity(intent);
    }
}
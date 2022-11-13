package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view) {
        Intent intent = new Intent(MainActivity.this,Login_Activity.class);
        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(MainActivity.this,Daftar_Activity.class);
        startActivity(intent);
    }
}
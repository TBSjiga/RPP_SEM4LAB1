package com.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Timer timer;

    // Метод создания 1 активити
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Метод старта активити (таймер)
    protected void onStart(){
        super.onStart();
        timer = new Timer();
        timer.execute(this);
    }

    // Метод *смерти* активити
    protected void Die(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }
}

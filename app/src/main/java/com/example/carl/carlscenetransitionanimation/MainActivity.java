package com.example.carl.carlscenetransitionanimation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onStartClick(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        //startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
    @Override
    public void finish() {
        super.finish();
        Log.i("carl","finish....");
        //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}

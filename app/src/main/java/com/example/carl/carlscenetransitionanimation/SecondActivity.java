package com.example.carl.carlscenetransitionanimation;

import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initAnimation();
        setContentView(R.layout.activity_second);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initAnimation(){
        getWindow().setEnterTransition(new Fade().setDuration(2000));
        //getWindow().setExitTransition(new Fade().setDuration(2000));
    }
    @Override
    public void finish() {
        super.finish();
        Log.i("carl","finish....");
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}

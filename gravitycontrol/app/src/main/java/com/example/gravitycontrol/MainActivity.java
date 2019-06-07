package com.example.gravitycontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

public class MainActivity extends AppCompatActivity {
    View imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View full_view = findViewById(R.id.parent);
        TranslateAnimation tdAnim = (TranslateAnimation) AnimationUtils.loadAnimation(this, R.anim.topdownanim);
        imageView1.startAnimation(tdAnim);
        TranslateAnimation tdAnim2 = (TranslateAnimation) AnimationUtils.loadAnimation(this, R.anim.downtop);
        imageView1.startAnimation(tdAnim2);
    }
}

package com.gaos.animation;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable drawanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        //drawable animation
        ImageView imviewDrawAnim = (ImageView) findViewById(R.id.imview);
        imviewDrawAnim.setBackgroundResource(R.drawable.drawable_animation);
        drawanim = (AnimationDrawable) imviewDrawAnim.getBackground();


    }

    public void drawanim(View view) {
        drawanim.start();
    }
}

package com.gaos.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewanim(View view) {
        ImageView imgview = (ImageView) findViewById(R.id.imgview);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.set_view);
        imgview.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(MainActivity.this, "view 动画结束", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void tvviewanim(View view) {
        TextView tvAnim = (TextView) findViewById(R.id.tv_anim);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.set_view);
        tvAnim.startAnimation(loadAnimation);
    }

    public void translateparent(View view) {
        LinearLayout llparent = (LinearLayout) findViewById(R.id.activity_main);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_translate);
        llparent.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(MainActivity.this, "parent动画执行结束", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}

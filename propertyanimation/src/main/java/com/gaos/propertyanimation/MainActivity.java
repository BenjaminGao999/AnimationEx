package com.gaos.propertyanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void propertyanim(View view) {
        ObjectAnimator rotation = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f);
        rotation.setDuration(1000);
        rotation.start();
    }

    public void outparent(View view) {
        ObjectAnimator translationX = ObjectAnimator.ofFloat(view, "translationX", getResources().getDisplayMetrics().widthPixels);
        translationX.setDuration(350);
        translationX.setInterpolator(new AccelerateInterpolator(2));
        translationX.start();
        translationX.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                Toast.makeText(MainActivity.this, "property anim finish", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void propertysimple(View view) {
        view.animate().x(0).y(0);
    }


}

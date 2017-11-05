package com.example.mifune.uticommunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome;
    TextView UTI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        welcome = (TextView) findViewById(R.id.welcome);
        UTI = (TextView) findViewById(R.id.UTI);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanim);
        welcome.startAnimation(myanim);
        UTI.startAnimation(myanim);

        final Intent intent =  new Intent(this, sigin.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                        startActivity(intent);
                        finish();
                }
            }
        };
        timer.start();
    }
}

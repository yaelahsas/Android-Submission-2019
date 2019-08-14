package sastra.panji.dhimas.androidsubmission;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    //Deklarasi waktu nya milisecond

    private int delay = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent move = new Intent(splash.this, MainActivity.class);
                startActivity(move);
                finish();
            }
        }, delay);
    }
}

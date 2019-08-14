package sastra.panji.dhimas.androidsubmission;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    //Deklarasi waktu nya milisecond

    private int delay = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

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

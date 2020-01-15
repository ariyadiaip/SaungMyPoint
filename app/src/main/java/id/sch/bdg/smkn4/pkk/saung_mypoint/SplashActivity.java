package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    SharedPreferences sr;
    Boolean first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            sr = getSharedPreferences("status" , MODE_PRIVATE);

            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_splash);

            first = sr.getBoolean("status" , true);

            if (first){
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        SharedPreferences.Editor editor = sr.edit();
                        first = false;
                        editor.putBoolean("status" , first);
                        editor.apply();

                        startActivity(new Intent(getApplicationContext(), StartedActivity.class));
                        finish();
                    }
                }, 3000L);
            }

            else {
             startActivity(new Intent(getApplicationContext(),LoginActivity.class));
             finish();
            }


        }

    }

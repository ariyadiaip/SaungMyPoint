package id.sch.bdg.smkn4.pkk.saung_mypoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class TutorialActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        TutorialAdapter adapter = new TutorialAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}

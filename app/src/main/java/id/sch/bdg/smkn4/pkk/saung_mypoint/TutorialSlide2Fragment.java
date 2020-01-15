package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TutorialSlide2Fragment extends Fragment {

    public TutorialSlide2Fragment(){}

    ViewPager viewPager;
    Button btnNext;
    TextView btnSkip;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v  = inflater.inflate(R.layout.fragment_tutorial_slide2, container, false);

        btnNext = v.findViewById(R.id.btn_next2);
        viewPager = getActivity().findViewById(R.id.viewPager);
        btnSkip = v.findViewById(R.id.btn_skip);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}

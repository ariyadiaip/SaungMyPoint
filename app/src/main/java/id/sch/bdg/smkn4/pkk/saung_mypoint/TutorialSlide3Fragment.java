package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TutorialSlide3Fragment extends Fragment {

    public TutorialSlide3Fragment(){}

    Button btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tutorial_slide3, container, false);

        btnNext = v.findViewById(R.id.btn_next3);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                getActivity().finish();
                startActivity(intent);
            }
        });

        return v;
    }
}

package id.sch.bdg.smkn4.pkk.saung_mypoint;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TutorialAdapter extends FragmentPagerAdapter {
    public TutorialAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TutorialSlide1Fragment();
            case 1:
                return new TutorialSlide2Fragment();
            case 2:
                return new TutorialSlide3Fragment();

                default:
                    return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

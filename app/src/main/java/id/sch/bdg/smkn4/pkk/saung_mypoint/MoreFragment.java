package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class MoreFragment extends Fragment {

    //List Menu
    List<MenuMore> menuList;

    //listView
    ListView lvMenu;

    CardView btnExit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_more, container, false);

        menuList = new ArrayList<>();
        lvMenu = (ListView) v.findViewById(R.id.lvMenu);
        addMenu();

        MenuMoreAdapter adapter = new MenuMoreAdapter(getContext(), R.layout.custom_lv_menu, menuList);
        lvMenu.setAdapter(adapter);

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    //kalo account
                    Toast.makeText(getContext(), "Fitur Ini Belum Tersedia", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    //kalo privasi
                    startActivity(new Intent(getActivity(),PrivacyPolice.class));
                } else if (position == 2) {
                    //kalo setting
                    startActivity(new Intent(getActivity(),SettingActivity.class));
                } else if (position == 3) {
                    //kalo about
                    startActivity(new Intent(getActivity(),AboutUs.class));
                } else if (position == 4) {
                    //kalo contact
                    startActivity(new Intent(getActivity(),ContactUs.class));
                } else if (position == 5) {
                    //kalo rate
                    Toast.makeText(getContext(), "Fitur Ini Belum Tersedia", Toast.LENGTH_SHORT).show();
                } else if (position == 6) {
                    //kalo bagikan
                    Toast.makeText(getContext(), "Fitur Ini Belum Tersedia", Toast.LENGTH_SHORT).show();
                } else {
                    //null
                }
            }
        });

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnExit = (CardView)view.findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                getActivity().finish();
                startActivity(new Intent(getContext() , LoginActivity.class));
            }
        });
    }

    private void addMenu() {
        menuList.add(new MenuMore(R.drawable.ic_account, "Akun"));
        menuList.add(new MenuMore(R.drawable.ic_privasi, "Kebijakan Privasi"));
        menuList.add(new MenuMore(R.drawable.ic_settings, "Pengaturan"));
        menuList.add(new MenuMore(R.drawable.ic_about, "Tentang Aplikasi"));
        menuList.add(new MenuMore(R.drawable.ic_contact_us, "Hubungi Kami"));
        menuList.add(new MenuMore(R.drawable.ic_rate, "Rate Aplikasi Ini"));
        menuList.add(new MenuMore(R.drawable.ic_share, "Bagikan Aplikasi Ini"));
    }
}

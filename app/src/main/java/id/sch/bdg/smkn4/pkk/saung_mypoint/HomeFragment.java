package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView myRe;
    HomeFeedAdapter adapter;
    private ArrayList<HomeFeed> listFeed;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home , container , false);
        myRe = (RecyclerView) v.findViewById(R.id.myFeed);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        addData();
        adapter = new HomeFeedAdapter(listFeed);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        myRe.setLayoutManager(layoutManager);
        myRe.setNestedScrollingEnabled(true);
        myRe.setAdapter(adapter);


    }

    private void addData() {
        listFeed = new ArrayList<>();
        listFeed.add(new HomeFeed(
                "Pohon Tumbang Di Sekitar Leuwi Panjang" ,
                "Menunggu Tanggapan" ,
                "80" ,
                "Aip Ariyadi" ,
                "Leuwi Panjang" ,
                "17 Jun" ,
                /*profile*/ R.color.ColorGreen,
                /*contentImage*/ R.drawable.content_2));

        listFeed.add(new HomeFeed(
                "Terjadi Kebakaran Di Daerah Buah Batu Dengan Skala Besar" ,
                "Menunggu Tanggapan" ,
                "120" ,
                "Naufal Ahnaf" ,
                "Buah Batu" ,
                "10 Aug" ,
                /*profile*/ R.color.ColorGreen,
                /*contentImage*/ R.drawable.content_1));

        listFeed.add(new HomeFeed(
                "Jalan Berlubang Daerah Kircon Sangat Mengganggu Kenyamanan Saat Berkendara" ,
                "Menunggu Tanggapan" ,
                "200" ,
                "Irvan Pebrian" ,
                "Kiara Condong" ,
                "7 Aug" ,
                /*profile*/ R.color.ColorGreen,
                /*contentImage*/ R.drawable.content_3));

        listFeed.add(new HomeFeed(
                "Banjir , Tolong Cepat Di Tanggapi Di Daerah Antapani" ,
                "Menunggu Tanggapan" ,
                "300" ,
                "Barnes Yosia" ,
                "Antapani" ,
                "11 Aug" ,
                /*profile*/ R.color.ColorGreen,
                /*contentImage*/ R.drawable.content_4));

        listFeed.add(new HomeFeed(
                "Puting Beliung Daerah Rancaekek , Rumah Warga Rusak Tolong Cepat Di Tangani" ,
                "Menunggu Tanggapan" ,
                "90" ,
                "Syarif Hidayat" ,
                "Rancaekek" ,
                "10 Jul" ,
                /*profile*/ R.color.ColorGreen,
                /*contentImage*/ R.drawable.content_5));

    }
}

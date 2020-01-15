package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MenuMoreAdapter extends ArrayAdapter<MenuMore> {

    //List Menu
    List<MenuMore> menuList;

    //Activity Context
    Context context;

    //layout untuk listitem
    int resource;

    //inisialisasi constructor
    public MenuMoreAdapter(Context context, int resource, List<MenuMore> menuList) {
        super(context, resource, menuList);
        this.context = context;
        this.resource = resource;
        this.menuList = menuList;
    }

    //mengembalikan Listview item menjadi view
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //get View
        View view = layoutInflater.inflate(resource, null, false);

        //get elements from view
        ImageView iconMenu = view.findViewById(R.id.imgMenu);
        TextView tvNameMenu = view.findViewById(R.id.tvNameMenu);

        MenuMore  menuMore = menuList.get(position);

        //Mengisi list Item
        iconMenu.setImageDrawable(context.getResources().getDrawable(menuMore.getIconMenu()));
        tvNameMenu.setText(menuMore.getNameMenu());

        //mengembalikan view
        return view;
    }

}

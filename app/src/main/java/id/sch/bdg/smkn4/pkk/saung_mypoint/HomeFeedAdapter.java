package id.sch.bdg.smkn4.pkk.saung_mypoint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HomeFeedAdapter extends RecyclerView.Adapter<HomeFeedAdapter.FeedViewHolder> {


    private ArrayList<HomeFeed> dataList;

    public HomeFeedAdapter(ArrayList<HomeFeed> dataList) {
        this.dataList = dataList;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_post_home, parent, false);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, final int position) {
        holder.photoAccount.setImageResource(dataList.get(position).getGambarProfile());
        holder.photoContent.setImageResource(dataList.get(position).getGambarContent());
        holder.txtContent.setText(dataList.get(position).getContent());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.txtDukungan.setText(dataList.get(position).getDukungan());
        holder.txtNamaPengirim.setText(dataList.get(position).getNamaPengirim());
        holder.txtDaerah.setText(dataList.get(position).getDaerah());
        holder.txtTanggal.setText(dataList.get(position).getTanggal());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class FeedViewHolder extends RecyclerView.ViewHolder{
        private ImageView photoAccount , photoContent;
        private TextView txtContent , txtStatus , txtDukungan , txtNamaPengirim , txtDaerah , txtTanggal;

        public FeedViewHolder(View itemView) {
            super(itemView);
            photoAccount = (ImageView)itemView.findViewById(R.id.photoAccount);
            photoContent = (ImageView)itemView.findViewById(R.id.photoPost);
            txtContent = (TextView)itemView.findViewById(R.id.contentPost);
            txtStatus = (TextView)itemView.findViewById(R.id.detailPost);
            txtDukungan = (TextView)itemView.findViewById(R.id.countVoter);
            txtNamaPengirim = (TextView)itemView.findViewById(R.id.nameAccount);
            txtDaerah = (TextView)itemView.findViewById(R.id.locatePost);
            txtTanggal = (TextView)itemView.findViewById(R.id.datePost);

        }
    }
}
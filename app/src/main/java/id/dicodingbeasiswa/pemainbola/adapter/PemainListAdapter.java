package id.dicodingbeasiswa.pemainbola.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.dicodingbeasiswa.pemainbola.R;
import id.dicodingbeasiswa.pemainbola.model.BolaModule;
import id.dicodingbeasiswa.pemainbola.ui.ActivityDetailBola;

public class PemainListAdapter extends RecyclerView.Adapter<PemainListAdapter.ListViewHolder> {

    private ArrayList<BolaModule> listpemain;

    public PemainListAdapter(ArrayList<BolaModule> list){
        this.listpemain = list;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPemain;
        TextView namaPemain,detailsPemain;
        RelativeLayout tapklik;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPemain = itemView.findViewById(R.id.img_pemain);
            namaPemain = itemView.findViewById(R.id.nama_pemain);
            detailsPemain = itemView.findViewById(R.id.detail_pemain);
            tapklik = itemView.findViewById(R.id.tap_click);
        }
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_dicoding,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final int itemPosition = holder.getAdapterPosition();
        BolaModule bolaModule = listpemain.get(position);
        Glide.with(holder.itemView.getContext())
                .load(bolaModule.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPemain);
        holder.namaPemain.setText(bolaModule.getName());
        holder.detailsPemain.setText(bolaModule.getDetail());
        final String itemName = bolaModule.getName();
        final String itemDetail = bolaModule.getDetail();
        final int pemainPhoto = bolaModule.getPhoto();

        holder.tapklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(v.getContext(), ActivityDetailBola.class);
                Intent intent = new Intent(holder.itemView.getContext(), ActivityDetailBola.class);
                Bundle b = new Bundle();
                String textName = itemName;
                String textDetail = itemDetail;
                int presPhoto = pemainPhoto;

                intent.putExtra("text", textName);
                intent.putExtra("detail", textDetail);
                b.putInt("photo", presPhoto);
                intent.putExtra("position", itemPosition);
                intent.putExtras(b);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listpemain.size();
    }
}

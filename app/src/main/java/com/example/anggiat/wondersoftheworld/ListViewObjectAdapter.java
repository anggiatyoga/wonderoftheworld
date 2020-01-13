package com.example.anggiat.wondersoftheworld;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListViewObjectAdapter extends RecyclerView.Adapter<ListViewObjectAdapter.ListViewViewHolder> {
    private final ArrayList<Object> listObject;

    public ListViewObjectAdapter(ArrayList<Object> listObject) {
        this.listObject = listObject;
    }

    @NonNull
    @Override
    public ListViewObjectAdapter.ListViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_object, parent, false);
        return new ListViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewObjectAdapter.ListViewViewHolder holder, int position) {
        final Object object = listObject.get(position);

        Glide.with(holder.itemView.getContext())
                .load(object.getPhoto())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.imgPhoto);

        holder.tvName.setText(object.getName());
        holder.tvCountry.setText(object.getCountry());

        Object objectData = new Object();
        objectData.setName(object.getName());
        objectData.setPhoto(object.getPhoto());
        objectData.setDetail(object.getDetail());
        objectData.setCountry(object.getCountry());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_DATA, object);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listObject.size();
    }

    class ListViewViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgPhoto;
        final TextView tvName;
        final TextView tvCountry;

        ListViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_object_photo);
            tvName = itemView.findViewById(R.id.text_object_nama);
            tvCountry = itemView.findViewById(R.id.text_object_country);
        }
    }
}

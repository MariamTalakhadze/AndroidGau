package com.example.volleyrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.volleyrecyclerview.Model.PhotoModel;
import com.example.volleyrecyclerview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PhotoRecyclerAdapter extends RecyclerView.Adapter<PhotoRecyclerAdapter.PhotoHolder> {
    private ArrayList<PhotoModel> PhotoData;
    private Context context;

    public PhotoRecyclerAdapter(Context context, ArrayList<PhotoModel> photoData) {
        PhotoData = photoData;
        this.context = context;
    }
    @NonNull
    @Override
    public PhotoRecyclerAdapter.PhotoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.photos_list, parent, false);
        final PhotoHolder holder = new PhotoHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoRecyclerAdapter.PhotoHolder holder, int position) {
        PhotoModel photo= PhotoData.get(position);
        holder.applyData(photo);
    }

    @Override
    public int getItemCount() {
        return PhotoData.size();
    }

    public class PhotoHolder extends RecyclerView.ViewHolder {
        private TextView Title ;
        private ImageView Image;
        public PhotoHolder(@NonNull View itemView) {
            super(itemView);
            Title =itemView.findViewById(R.id.title);
            Image = itemView.findViewById(R.id.image);
        }
        void applyData(PhotoModel photo){
            Title.setText(photo.getTitle()+"");
            Picasso.get().load(photo.getUrl()).into(Image);
            itemView.setOnClickListener(v -> {
                myclick.OnClickListener(photo);
            });
        }
    }
    private clicklistener myclick;

    public void setOnClickListener(clicklistener listener){
        this.myclick= listener;
    }

    public interface clicklistener{
        void OnClickListener(PhotoModel photo);
    }
}

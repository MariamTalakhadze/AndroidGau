package com.example.volleyrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.volleyrecyclerview.Model.PostModel;
import com.example.volleyrecyclerview.R;

import java.util.ArrayList;

public class PostRecyclerAdapter  extends RecyclerView.Adapter<PostRecyclerAdapter.PostHolder> {
    private ArrayList<PostModel> postData;
    private Context context;

    public PostRecyclerAdapter(Context context, ArrayList<PostModel> postData) {
        this.postData = postData;
        this.context = context;
    }

    @Override
    public PostRecyclerAdapter.PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_list, parent, false);
        final PostHolder holder = new PostHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostRecyclerAdapter.PostHolder holder, int position) {
        holder.Title.setText(postData.get(position).getTitle());
        holder.ID.setText(postData.get(position).getid()+"");
    }
    @Override
    public int getItemCount() {
        return postData.size();
    }

    public class PostHolder extends RecyclerView.ViewHolder {
        private TextView Title;
        private TextView ID;
        public PostHolder(@NonNull View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.PostTitle);
            ID = itemView.findViewById(R.id.PostCounmt);
        }

    }
}

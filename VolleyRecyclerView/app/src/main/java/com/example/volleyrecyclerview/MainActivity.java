package com.example.volleyrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.volleyrecyclerview.Adapter.PostRecyclerAdapter;

public class MainActivity extends AppCompatActivity {
    private Button post, photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        post = findViewById(R.id.PostButton);
        photos = findViewById(R.id.PhotosButton);
        post.setOnClickListener(v->{
            Intent intent = new Intent(this, PostActivity.class);
            startActivity(intent);

        });
        photos.setOnClickListener(v->{
            Intent intent = new Intent(this, PhotosActivity.class);
            startActivity(intent);
        });


    }



}

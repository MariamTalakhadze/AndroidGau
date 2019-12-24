package com.example.volleyrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.volleyrecyclerview.Model.PhotoModel;
import com.example.volleyrecyclerview.R;
import com.squareup.picasso.Picasso;

public class PhotoInner extends AppCompatActivity {
    private ImageView detailedimg;
    private TextView title;
    private TextView imgurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_inner);
        detailedimg = findViewById(R.id.innerimg);
        title = findViewById(R.id.innerTitle);
        imgurl = findViewById(R.id.ImgURL);
        PhotoModel photo = (PhotoModel) getIntent().getSerializableExtra("photo");
        if (photo != null) {
            Picasso.get().load(photo.getUrl()).into(detailedimg);
            title.setText(photo.getTitle()+"");
            imgurl.setText(photo.getUrl()+"");

        }
    }
}

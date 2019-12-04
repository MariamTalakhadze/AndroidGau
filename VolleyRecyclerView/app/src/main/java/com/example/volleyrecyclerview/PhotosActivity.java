package com.example.volleyrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.volleyrecyclerview.Adapter.PhotoRecyclerAdapter;
import com.example.volleyrecyclerview.Model.PhotoModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class PhotosActivity extends AppCompatActivity {
    ArrayList<PhotoModel> PhotoData;
    private androidx.recyclerview.widget.RecyclerView RecyclerView;
    private PhotoRecyclerAdapter photoadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        initPhotoAdapter();
    }

    private void initPhotoAdapter(){
        PhotoData= new ArrayList<>();
        RecyclerView = findViewById(R.id.PhotoRecycler);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        photoadapter = new PhotoRecyclerAdapter(getApplicationContext(), PhotoData);
        photoadapter.setOnClickListener(this::OnClickListener);
        RecyclerView.setAdapter(photoadapter);

        JsonArrayRequest postArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                "https://jsonplaceholder.typicode.com/photos",
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i=0; i<response.length(); i++){
                            try {
                                JSONObject item = response.getJSONObject(i);
                                PhotoModel data = new PhotoModel(item.getString("url"), item.getString("thumbnailUrl"), item.getString("title"),item.getInt("id"),item.getInt("albumId"));
                                PhotoData.add(data);
                            } catch (JSONException e) { e.printStackTrace(); }
                        }
                        photoadapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) { }
                }
        );

        RequestQueue newRequestQueue = Volley.newRequestQueue(this);
        newRequestQueue.add(postArrayRequest);
    }

    public void OnClickListener(PhotoModel photo) {
        Intent intent = new Intent(this, PhotoInner.class);
        intent.putExtra("photo", photo);
        startActivity(intent);
    }
}

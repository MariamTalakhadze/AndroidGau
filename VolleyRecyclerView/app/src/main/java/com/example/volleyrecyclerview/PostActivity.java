package com.example.volleyrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.volleyrecyclerview.Adapter.PostRecyclerAdapter;
import com.example.volleyrecyclerview.Model.PostModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class PostActivity extends AppCompatActivity {
    ArrayList<PostModel> PostData;
    private androidx.recyclerview.widget.RecyclerView RecyclerView;
    private PostRecyclerAdapter postadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        initPostAdapter();
    }

    private void initPostAdapter(){
        PostData= new ArrayList<>();
        RecyclerView = findViewById(R.id.PostRecycler);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        postadapter = new PostRecyclerAdapter(getApplicationContext(), PostData);
        RecyclerView.setAdapter(postadapter);

        JsonArrayRequest postArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                "https://jsonplaceholder.typicode.com/posts",
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i=0; i<response.length(); i++){
                            try {
                                JSONObject item = response.getJSONObject(i);
                                PostModel data = new PostModel(item.getInt("userId"), item.getInt("id"), item.getString("title"), item.getString("body"));
                                PostData.add(data);
                            } catch (JSONException e) { e.printStackTrace(); }
                        }
                        postadapter.notifyDataSetChanged();
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


}

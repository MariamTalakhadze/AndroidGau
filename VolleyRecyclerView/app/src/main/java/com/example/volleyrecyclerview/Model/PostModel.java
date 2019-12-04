package com.example.volleyrecyclerview.Model;

import java.io.Serializable;

public class PostModel implements Serializable {
    public int UserID;
    public int id;
    public String Title;
    public String Body;

    public PostModel(int userID, int id, String title, String body) {
        UserID = userID;
        this.id = id;
        Title = title;
        Body = body;
    }

    public int getUserID() {
        return UserID;
    }

    public int getid() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getBody() {
        return Body;
    }
}

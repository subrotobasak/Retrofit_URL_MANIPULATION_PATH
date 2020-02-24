package com.example.retrofit_url_manipulation_path.Model;

public class Model {

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    // All name will be same.
    // If you want to use other name then use @SerializedName before.
    // Ex:@SerializedName("userId") private int userId or other;


    //Constructor
    public Model(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    //Getter Method

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }
}

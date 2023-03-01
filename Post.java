package com.siddhant.socail2;

import com.google.firebase.firestore.PropertyName;

public class Post {
    @PropertyName("name")
    private String name;

    @PropertyName("description")
    private String description;

    @PropertyName("imageUrl")
    private String imageUrl;

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

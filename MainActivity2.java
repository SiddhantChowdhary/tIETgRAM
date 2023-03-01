package com.siddhant.socail2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //addDummyPostsToFirestore();
    }
    private void addDummyPostsToFirestore() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        // Generate 20 dummy posts
        List<Post> posts = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Post post = new Post(
                    "Post " + i,
                    "Description of post " + i,
                    "https://example.com/image" + i + ".jpg"
            );
            posts.add(post);
        }

        // Add each post to a Firestore collection called "posts"
        CollectionReference postsRef = db.collection("posts");
        for (Post post : posts) {
            postsRef.add(post);
        }
    }


}
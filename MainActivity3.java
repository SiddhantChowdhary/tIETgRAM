package com.siddhant.socail2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        CollectionReference postsRef = FirebaseFirestore.getInstance().collection("posts");
        Query query = postsRef.orderBy("name", Query.Direction.DESCENDING);
        FirestoreRecyclerOptions<Post> options = new FirestoreRecyclerOptions.Builder<Post>()
                .setQuery(query, Post.class)
                .build();
        FirestoreRecyclerAdapter<Post, PostViewHolder> adapter = setadapter(options);
        RecyclerView recyclerView = findViewById(R.id.feeder);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.startListening();


    }
    FirestoreRecyclerAdapter<Post, PostViewHolder> setadapter(FirestoreRecyclerOptions<Post> options)
    {
        FirestoreRecyclerAdapter<Post, PostViewHolder> adapter =
                new FirestoreRecyclerAdapter<Post, PostViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull PostViewHolder holder, int position, @NonNull Post model) {
                        // Set the views in the ViewHolder with the data from the Post model
                        holder.setName(model.getName());
                        holder.setDescription(model.getDescription());
                        holder.setImageUrl(model.getImageUrl());
                    }

                    @NonNull
                    @Override
                    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        // Create a new ViewHolder for the posts
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
                        return new PostViewHolder(view);
                    }
                };
        return adapter;

    }
}
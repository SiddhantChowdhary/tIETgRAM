package com.siddhant.socail2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


public class PostViewHolder extends RecyclerView.ViewHolder {
    private final TextView nameTextView;
    private final TextView descriptionTextView;
    private final ImageView imageView;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.post_title);
        descriptionTextView = itemView.findViewById(R.id.post_desc);
        imageView = itemView.findViewById(R.id.post_image);
    }

    public void setName(String name) {
        nameTextView.setText(name);
    }

    public void setDescription(String description) {
        descriptionTextView.setText(description);
    }

    public void setImageUrl(String imageUrl) {
        Glide.with(imageView.getContext()).load(imageUrl).into(imageView);
    }
}

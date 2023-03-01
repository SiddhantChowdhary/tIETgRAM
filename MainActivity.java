package com.siddhant.socail2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;
import com.facebook.soloader.SoLoader;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoLoader.init(this, false);
       // setContentView(R.layout.activity_main);

        /*
        Button feed=findViewById(R.id.feeds);
        feed.setOnClickListener(v -> {
            Intent intent12 = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent12);
        });
        Button add=findViewById(R.id.dataAdd);
        add.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent1);
        });
        */
        final ComponentContext c = new ComponentContext(this);

        final Component component = Text.create(c)
                .text("Hello World")
                .textSizeDip(50)
                .build();

        setContentView(LithoView.create(c, component));


    }

}

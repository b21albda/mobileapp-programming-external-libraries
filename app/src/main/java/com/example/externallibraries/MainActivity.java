package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        ImageView img = findViewById(R.id.imageView);
        EditText input = findViewById(R.id.et_input);

        btn.setOnClickListener(View -> {
            String url = input.getText().toString();

            if (!url.isEmpty())
                Glide.with(this).load(url).into(img);
        });
    }
}

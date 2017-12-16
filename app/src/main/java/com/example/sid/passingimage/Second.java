package com.example.sid.passingimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Uri uri = getIntent().getParcelableExtra("image");
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        imageView.setImageURI(uri);
    }
}

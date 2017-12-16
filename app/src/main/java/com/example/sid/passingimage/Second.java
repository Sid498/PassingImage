package com.example.sid.passingimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*try{
            Uri uri = this.getIntent().getParcelableExtra("image");
            imageView = (ImageView) findViewById(R.id.imageview);
            imageView.setImageURI(uri);
        }catch (Exception e){
            Toast.makeText(this, " "+e, Toast.LENGTH_SHORT).show();
        }*/

        try{
        Bundle bundle = getIntent().getExtras();
        Bitmap bitmap = bundle.getParcelable("image");
        imageView.setImageBitmap(bitmap);
        }catch (Exception e){
            Toast.makeText(this, " "+e, Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }
}

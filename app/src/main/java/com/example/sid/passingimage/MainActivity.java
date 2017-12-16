package com.example.sid.passingimage;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageview);
    }

    public void pickImage(View v){
        Intent intent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100 && resultCode == RESULT_OK){
            Uri image = data.getData();
            /*String[] filePath = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(image,filePath,null,null,null);
            cursor.moveToFirst();

            int index = cursor.getColumnIndex(filePath[0]);
            String path = cursor.getString(index);
            cursor.close();
            imageView.setImageBitmap(BitmapFactory.decodeFile(path));*/

            imageView.setImageURI(image);

            Intent intent = new Intent(this,Second.class);
            intent.putExtra("image",image);
            startActivity(intent);
        }
    }
}

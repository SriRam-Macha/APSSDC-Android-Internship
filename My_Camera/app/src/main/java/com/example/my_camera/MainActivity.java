package com.example.my_camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final int pic_id = 123;
    Button Camera_open;
    ImageView imageview;
    Bitmap bTemp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MainActivity prevActivity = (MainActivity) getLastNonConfigurationInstance();

        if(prevActivity!= null) {
            this.bTemp = prevActivity.bTemp;
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Camera_open = findViewById(R.id.opencamera);
        imageview = findViewById(R.id.imageview);

        Camera_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, pic_id);
            }
        });

    }



    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {

        // Match the request 'pic id with requestCode
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == pic_id) {

            // BitMap is data structure of image file
            // which stor the image in memory
            Bitmap photo = (Bitmap) data.getExtras()
                    .get("data");
            Bitmap bTemp = (Bitmap) data.getExtras().get("data");

            // Set the image in imageview for display
            imageview.setImageBitmap(bTemp);
        }
    }



}


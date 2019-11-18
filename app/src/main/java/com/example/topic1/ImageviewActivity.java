package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageviewActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rbimg1, rbimg2, rbimg3;
    ImageView imv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);

        rbimg1 = findViewById(R.id.rbimg1);
        rbimg2 = findViewById(R.id.rbimg2);
        rbimg3 = findViewById(R.id.rbimg3);
        imv1 = findViewById(R.id.imv1);

        rbimg1.setOnClickListener(this);
        rbimg2.setOnClickListener(this);
        rbimg3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

     switch (v.getId())
     {
         case R.id.rbimg1: {
             imv1.setImageResource(R.drawable.image1);
             break;
         }
         case R.id.rbimg2: {
             imv1.setImageResource(R.drawable.image2);
             break;
         }
         case R.id.rbimg3: {
             imv1.setImageResource(R.drawable.image3);
             break;
         }
     }
    }
}

package com.example.menudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Animals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String imgIndex = bundle.getString("ImageIndex");
            setImage(imgIndex);
        }
    }
    private  void setImage(String index){
        ImageView imgView = (ImageView)findViewById(R.id.imgAnimals);
        switch (index) {
            case "1":
                imgView.setImageResource(R.drawable.impala);
                break;
            case "2":
                imgView.setImageResource(R.drawable.ingagi);
                break;
            case "3":
                imgView.setImageResource(R.drawable.ingwe);
                break;
            case "4":
                imgView.setImageResource(R.drawable.inzovu);
                break;
        }
    }
}
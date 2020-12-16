package com.example.listview_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CityActivity extends AppCompatActivity {

    private TextView textViewResult;
    private ImageView imageCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        setTitle(title);

        textViewResult = (TextView) findViewById(R.id.textView_result);
        imageCity = (ImageView) findViewById(R.id.imageView_cityPic);

        textViewResult.setText("");

        int img = intent.getIntExtra("image", R.drawable.taipei1);
        imageCity.setImageResource(img);

        String result = intent.getStringExtra("result");
        textViewResult.setText(result);


    }
}
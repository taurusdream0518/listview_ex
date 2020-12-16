package com.example.listview_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private ListView listViewCity;
    private List<Map<String, Object>> itemList;
    private String[] cityName;
    private int[] cityPicture = {R.drawable.taipei,R.drawable.taoyuan,R.drawable.ilan,R.drawable.changhua,R.drawable.pingtung};
    private Intent intent;
    private String[] cityResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        listViewCity = (ListView) findViewById(R.id.listView_id);

        itemList = new ArrayList<Map<String,Object>>();

        cityName = getResources().getStringArray(R.array.city);
        cityResult = getResources().getStringArray(R.array.result);

        for(int i = 0 ; i<cityName.length ; i++){
            Map<String, Object> data = new HashMap<>();
            data.put("name",cityName[i]);
            data.put("image",cityPicture[i]);
            itemList.add(data);
        }

        SimpleAdapter adqpter = new SimpleAdapter(context, itemList, R.layout.item_layout,new String[]{"name","image"},new int[]{R.id.textView_city,R.id.imageView_pic});

        listViewCity.setAdapter(adqpter);

        intent = new Intent(context,CityActivity.class);

        listViewCity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent.putExtra("title",cityName[position]);
                        intent.putExtra("image",cityPicture[position]);
                        intent.putExtra("result",cityResult[position]);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("title",cityName[position]);
                        intent.putExtra("image",cityPicture[position]);
                        intent.putExtra("result",cityResult[position]);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("title",cityName[position]);
                        intent.putExtra("image",cityPicture[position]);
                        intent.putExtra("result",cityResult[position]);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("title",cityName[position]);
                        intent.putExtra("image",cityPicture[position]);
                        intent.putExtra("result",cityResult[position]);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("title",cityName[position]);
                        intent.putExtra("image",cityPicture[position]);
                        intent.putExtra("result",cityResult[position]);
                        startActivity(intent);
                        break;
                }

            }
        });




    }
}
package com.example.nativplugins2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
            new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick (AdapterView<?> listView, View itemView, int position, long id) {
                    if (position == 0){
                        Intent intent = new Intent(MainActivity.this, PluginCategory.class);
                        startActivity(intent);
                    }
                    if (position == 1){
                        Intent intent = new Intent(MainActivity.this, DesignActivity.class);
                        startActivity(intent);
                    }
                    if (position == 2){
                        Intent intent = new Intent(MainActivity.this, BusinessActivity.class);
                        startActivity(intent);
                    }
                }
            };
        ListView listView = (ListView)findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
package com.example.nativplugins2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PluginCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin_category);

        ArrayAdapter<Plugin> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Plugin.plugins);
        ListView listPlugins = (ListView)findViewById(R.id.list_plugins);
        listPlugins.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(PluginCategory.this,
                                PluginActivity.class);
                        intent.putExtra(PluginActivity.EXTRA_PLUGINID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listPlugins.setOnItemClickListener(itemClickListener);
    }
}
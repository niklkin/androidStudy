package com.example.nativplugins2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PluginActivity extends AppCompatActivity {
    public static final String EXTRA_PLUGINID = "pluginId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin);

        int pluginId = (Integer)getIntent().getExtras().get(EXTRA_PLUGINID);
        Plugin drink = Plugin.plugins[pluginId];

        //Populate the drink name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        //Populate the drink description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());

    }
}
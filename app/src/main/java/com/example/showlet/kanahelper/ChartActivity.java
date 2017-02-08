package com.example.showlet.kanahelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Field;

public class ChartActivity extends AppCompatActivity {

    GridView grid;
    private String _type;
    private Kana _kanas;

    int[] imageId = {
            R.mipmap.hiragana,
            R.mipmap.hiragana,
            R.mipmap.hiragana,
            R.mipmap.hiragana,
            R.mipmap.hiragana,
            R.mipmap.hiragana,
            R.mipmap.hiragana
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        Intent intent = getIntent();
        _type = intent.getStringExtra("Type");
        init();
    }


    private void init() {
            final Chart chart = new Chart(_type);
            CustomGrid adapter = new CustomGrid(ChartActivity.this, chart.getValues(), chart.getIds());
            grid = (GridView) findViewById(R.id.grid);
            grid.setAdapter(adapter);
        grid.smoothScrollByOffset(25);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Toast.makeText(ChartActivity.this, "You Clicked at " +  chart.getValues()[+position], Toast.LENGTH_SHORT).show();

                }
            });
    }
}


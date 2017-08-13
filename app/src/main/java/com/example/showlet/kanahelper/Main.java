package com.example.showlet.kanahelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void openHiraganaChart(View view) {
        Intent myIntent = new Intent(this, ChartActivity.class);
        myIntent.putExtra("Type", "Hiragana"); //Optional parameters
        this.startActivity(myIntent);
    }

    protected void openKatakanaChart(View view) {
        Intent myIntent = new Intent(this, ChartActivity.class);
        myIntent.putExtra("Type", "Katakana"); //Optional parameters
        this.startActivity(myIntent);
    }
}

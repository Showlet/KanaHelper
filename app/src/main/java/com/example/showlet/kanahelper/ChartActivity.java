package com.example.showlet.kanahelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by showlet on 06/02/17.
 */

public class ChartActivity extends AppCompatActivity {

    private String _type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        Intent intent = getIntent();
        _type = intent.getStringExtra("Type");
        init();
    }

    private void init() {
        if (_type.contains("iragana")) {
            Chart chart = new Chart("Hiragana");
            Toast toast = Toast.makeText(this, chart.getKanas()[1].getSyllable(), Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

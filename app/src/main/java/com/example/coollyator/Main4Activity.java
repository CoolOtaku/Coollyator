package com.example.coollyator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main4);
            Button zvich = (Button) findViewById(R.id.zvich);
            Button chas = (Button) findViewById(R.id.chas);
            Button rozrab = (Button) findViewById(R.id.rozrab);
            Button bwb = (Button) findViewById(R.id.bwb);
            TextView textView6 = (TextView)findViewById(R.id.textView6);
            TextView textView8 = (TextView)findViewById(R.id.textView8);
            TextView textView9 = (TextView)findViewById(R.id.textView9);
            TextView textView4 = (TextView)findViewById(R.id.textView4);

            textView6.setText(R.string.usuals);
            textView8.setText(R.string.temporal);
            textView9.setText(R.string.developers);
            textView4.setText(R.string.exchange_rate);

            View.OnClickListener l = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.zvich:
                            Intent in1 = new Intent();
                            in1.setClass(Main4Activity.this, MainActivity.class);
                            startActivity(in1);
                            break;
                        case R.id.chas:
                            Intent in2 = new Intent();
                            in2.setClass(Main4Activity.this, Main3Activity.class);
                            startActivity(in2);
                            break;
                        case R.id.rozrab:
                            Intent in3 = new Intent();
                            in3.setClass(Main4Activity.this, Main2Activity.class);
                            startActivity(in3);
                            break;
                        case R.id.bwb:
                            Intent in4 = new Intent();
                            in4.setClass(Main4Activity.this, Main5Activity.class);
                            startActivity(in4);
                            break;
                    }
                }

            };
            zvich.setOnClickListener(l);
            chas.setOnClickListener(l);
            rozrab.setOnClickListener(l);
            bwb.setOnClickListener(l);
        } catch (Exception e) {
            Intent intent = new Intent();
            intent.setClass(Main4Activity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}

package com.example.coollyator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            TextView textView = (TextView)findViewById(R.id.textView);
            TextView textView2 = (TextView)findViewById(R.id.textView2);
            Button button6 = (Button)findViewById(R.id.button6);

            textView.setText(R.string.nazar);
            textView2.setText(R.string.misha);

            View.OnClickListener l = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.button6:
                            Intent in4 = new Intent();
                            in4.setClass(Main2Activity.this, Main4Activity.class);
                            startActivity(in4);
                    }
                }
            };
            button6.setOnClickListener(l);
        }catch (Exception e){
            Intent intent = new Intent();
            intent.setClass(Main2Activity.this,MainActivity.class);
            startActivity(intent);
        }}
}

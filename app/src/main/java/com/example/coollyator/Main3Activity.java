package com.example.coollyator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    double num1;
    int op1;
    int op2;
    double num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button2 = (Button)findViewById(R.id.button2);
        final EditText edt = (EditText)findViewById(R.id.edt);
        final EditText tv = (EditText) findViewById(R.id.textView5);
        Button button = (Button)findViewById(R.id.button);
        final TextView nr2 = (TextView)findViewById(R.id.nr2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        Button bClear2 = (Button)findViewById(R.id.bClear2);
        RadioButton bR = (RadioButton)findViewById(R.id.bR);
        RadioButton bM = (RadioButton)findViewById(R.id.bM);
        RadioButton bG = (RadioButton)findViewById(R.id.bG);
        RadioButton bH = (RadioButton)findViewById(R.id.bH);
        RadioButton bS = (RadioButton)findViewById(R.id.bS);
        RadioButton bR2 = (RadioButton)findViewById(R.id.bR2);
        RadioButton bM2 = (RadioButton)findViewById(R.id.bM2);
        RadioButton bG2 = (RadioButton)findViewById(R.id.bG2);
        RadioButton bH2 = (RadioButton)findViewById(R.id.bH2);
        RadioButton bS2 = (RadioButton)findViewById(R.id.bS2);
        RadioButton bD = (RadioButton)findViewById(R.id.bD);
        RadioButton bD1 = (RadioButton)findViewById(R.id.bD1);

        bR.setText(R.string.year);
        bR2.setText(R.string.year);
        bM.setText(R.string.month);
        bM2.setText(R.string.month);
        bG.setText(R.string.hour);
        bG2.setText(R.string.hour);
        bH.setText(R.string.minute);
        bH2.setText(R.string.minute);
        bS.setText(R.string.second);
        bS2.setText(R.string.second);
        bD.setText(R.string.day);
        bD1.setText(R.string.day);
        bClear2.setText(R.string.clear);
        textView3.setText(R.string.rr);

        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    StringBuilder sb = new StringBuilder("");
                    switch (v.getId()){
                        case R.id.bR:
                            op1=1;
                            break;
                        case R.id.bM:
                            op1=2;
                            break;
                        case R.id.bG:
                            op1=3;
                            break;
                        case R.id.bH:
                            op1=4;
                            break;
                        case R.id.bS:
                            op1=5;
                            break;
                        case R.id.bR2:
                            op2=1;
                            break;
                        case R.id.bM2:
                            op2=2;
                            break;
                        case R.id.bG2:
                            op2=3;
                            break;
                        case R.id.bH2:
                            op2=4;
                            break;
                        case R.id.bS2:
                            op2=5;
                            break;
                        case R.id.bD:
                             op1=6;
                             break;
                        case R.id.bD1:
                            op2=6;
                            break;
                        case R.id.bClear2:
                            tv.setText("");
                            edt.setText("");
                            num1 = 0;
                            num2 = 0;
                            nr2.setText("");
                            break;
                        case R.id.button2:
                            Intent in = new Intent();
                            in.setClass(Main3Activity.this,Main4Activity.class);
                            startActivity(in);
                            break;
                        case R.id.button:
                            String s = String.valueOf(edt.getText());
                            num1 = Double.parseDouble(s);
                            if(op1==1&op2==2){
                                num2=12.166666666832132*num1;
                            }
                            if(op1==1&op2==3){
                                num2=8760.000000119137*num1;
                            }
                            if(op1==1&op2==4){
                                num2=525600.0000071481*num1;
                            }
                            if(op1==1&op2==5){
                                num2=31536000.00042889*num1;
                            }
                            if(op1==2&op2==1){
                                num2=num1/12.166666666832132;
                            }
                            if(op1==2&op2==3){
                                num2=720.0000000000001*num1;
                            }
                            if(op1==2&op2==4){
                                num2=43200.00000000001*num1;
                            }
                            if(op1==2&op2==5){
                                num2=2592000.0000000005*num1;
                            }
                            if(op1==3&op2==1){
                                num2=0.00011415525114*num1;
                            }
                            if(op1==3&op2==2){
                                num2=0.0013888888888888887*num1;
                            }
                            if(op1==3&op2==4){
                                num2=num1*60;
                            }
                            if(op1==3&op2==5){
                                num2=num1*3600;
                            }
                            if(op1==4&op2==1){
                                num2=num1*0.000001902587519;
                            }
                            if(op1==4&op2==2){
                                num2=num1*0.000023148148148148147;
                            }
                            if(op1==4&op2==3){
                                num2=num1*0.016666666666666666;
                            }
                            if(op1==4&op2==5){
                                num2=num1*60;
                            }
                            if(op1==5&op2==1){
                                num2=num1*3.1709791983333334e-8;
                            }
                            if(op1==5&op2==2){
                                num2=num1/3.8580246913580245e-7;
                            }
                            if(op1==5&op2==3){
                                num2=num1*0.0002777777777777778;
                            }
                            if(op1==5&op2==4){
                                num2=num1/60;
                            }
                            if(op1==6&op2==1){
                                num2=num1*0.00273972602736;
                            }
                            if(op1==6&op2==2){
                                num2=num1*0.03333333333333333;
                            }
                            if(op1==6&op2==3){
                                num2=num1*24;
                            }
                            if(op1==6&op2==4){
                                num2=num1*1440;
                            }
                            if(op1==6&op2==5){
                                num2=num1*86400;
                            }
                            if(op1==1&op2==6){
                                num2=num1*365.00000000496397;
                            }
                            if(op1==3&op2==6){
                                num2=num1*0.041666666666666664;
                            }
                            if(op1==4&op2==6){
                                num2=num1*0.0006944444444444444;
                            }
                            if(op1==5&op2==6){
                                num2=num1*0.000011574074074074073;
                            }
                            else {
                                nr2.setText(R.string.error);
                            }
                            tv.setText(String.valueOf(num2));
                            nr2.setText(String.valueOf(num2));
                    }}catch(Exception e){
                    nr2.setText(R.string.error);
                }
            }
        };
        bClear2.setOnClickListener(l);
        button.setOnClickListener(l);
        button2.setOnClickListener(l);
        bG.setOnClickListener(l);
        bR.setOnClickListener(l);
        bM.setOnClickListener(l);
        bH.setOnClickListener(l);
        bS.setOnClickListener(l);
        bR2.setOnClickListener(l);
        bH2.setOnClickListener(l);
        bG2.setOnClickListener(l);
        bS2.setOnClickListener(l);
        bM2.setOnClickListener(l);
        bD.setOnClickListener(l);
        bD1.setOnClickListener(l);
    }
}

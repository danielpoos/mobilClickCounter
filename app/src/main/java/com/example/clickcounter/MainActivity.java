package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ertek = Integer.parseInt(textView.getText().toString());
                ertek++;
                String stringErtek = String.valueOf(ertek);
                textView.setText(stringErtek);
                if (ertek>0){
                    textView.setTextColor(Color.GREEN);
                }
                else if (ertek< 0){
                    textView.setTextColor(Color.RED);
                }
                else{
                    textView.setTextColor(Color.BLUE);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ertek = Integer.parseInt(textView.getText().toString());
                ertek--;
                String stringErtek = String.valueOf(ertek);
                textView.setText(stringErtek);
                if (ertek>0){
                    textView.setTextColor(Color.GREEN);
                }
                else if (ertek< 0){
                    textView.setTextColor(Color.RED);
                }
                else{
                    textView.setTextColor(Color.BLUE);
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
                textView.setTextColor(Color.BLUE);
            }
        });
    }
    private void init(){
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        textView = findViewById(R.id.text);
    }
}

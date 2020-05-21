package com.example.myapplication2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    public class clickNumber {
        //static変数
        public int number;

        public int getNumber() {
            return this.number;
        }

    }
    clickNumber click = new clickNumber();
    public void test(boolean i){
        if(i){
            click.number++;
            changeText("text",click.getNumber());
        }else{
            click.number--;
            changeText("text",click.getNumber());
        }
    }

    public void changeText(String id, int v){
        ((TextView) findViewById(R.id.text)).setText(Integer.toString(v));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        clickNumber click = new clickNumber();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.changeTextButton);

        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // クリック時の処理
                test(true);
            }
        });

        findViewById(R.id.changeint).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test(false);
            }
        });
    }
}

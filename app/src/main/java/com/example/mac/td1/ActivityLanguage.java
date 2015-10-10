package com.example.mac.td1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /*
        TextView text = new TextView(this);
        text.setText("Hello the world...");
        setContentView(text);
       */

        setContentView(R.layout.activity_language);


    }

    public void english(View v){
        Intent i = new Intent(ActivityLanguage.this,MainActivity.class);
        String language = "english" ;
        i.putExtra("language", language);
        startActivity(i);
    }

    public void french(View v){
        Intent i = new Intent(ActivityLanguage.this,MainActivity.class);
        String language = "french" ;
        i.putExtra("language",language);
        startActivity(i);
    }
}

package com.example.mac.td1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView profileFirstName, profileLastName;
    String firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(Activity2.this);
        View main = inflater.inflate(R.layout.activity_2, null);

        firstName = getIntent().getStringExtra("firstName");
        profileFirstName =  (TextView) main.findViewById(R.id.profileFirstName);
        profileFirstName.setText(firstName);

        lastName = getIntent().getStringExtra("lastName");
        profileLastName = (TextView) main.findViewById(R.id.profileName);
        profileLastName.setText(lastName);

        int age = getIntent().getIntExtra("age", 0);

        setContentView(R.layout.activity_2);
    }


}

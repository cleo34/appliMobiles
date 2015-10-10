package com.example.mac.td1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /*
        TextView text = new TextView(this);
        text.setText("Cet appli est beaucoup trop lente...");
        setContentView(text);
       */
        setContentView(R.layout.activity_main);
    }

    /*
    final EditText lastNameField = (EditText) findViewById(R.id.lastName);
    String lastName = lastNameField.getText().toString();
     */

    final EditText firstNameField  = (EditText) findViewById(R.id.firstName);
    String firstName = firstNameField.getText().toString();

    final EditText ageField  = (EditText) findViewById(R.id.age);
    String age = ageField.getText().toString();

    final EditText skillsField  = (EditText) findViewById(R.id.skills);
    String skills = skillsField.getText().toString();

    final EditText phoneField  = (EditText) findViewById(R.id.phone);
    String phone = phoneField.getText().toString();

    public void sendInfos(View button){
        // first parameter is the context, second is the class of the activity to launch
        Intent i = new Intent(MainActivity.this, Activity2.class);
        // put "extras" into the bundle for access in the second activity
        //i.putExtra("lastName", lastName);
        i.putExtra("firstName", firstName);
        i.putExtra("age", age);
        i.putExtra("skills", skills);
        i.putExtra("phone", phone);

        // brings up the second activity
        startActivity(i);
    }
}

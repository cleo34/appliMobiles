package com.example.mac.td1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.mac.td1.Utilities;


public class MainActivity extends AppCompatActivity {

    String lastName, firstName, skills, phone;
    int age;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /*
        TextView text = new TextView(this);
        text.setText("Hello the world...");
        setContentView(text);
       */

        String language = getIntent().getStringExtra("language");
        switch (language){
            case("english"):
                    setContentView(R.layout.activity_main);
                break;

            case("french"):
                    setContentView(R.layout.activity_main_french);
                break;

            default:
                setContentView(R.layout.activity_main);
                String message = "Can't receive parameters from Activity_Language";
                Log.v("message:", message);
                break;


        }
    }

    public void send(View v){

        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        View main = inflater.inflate(R.layout.activity_main, null);

        final EditText lastNameField = (EditText) main.findViewById(R.id.lastName);

        final EditText firstNameField  = (EditText) main.findViewById(R.id.firstName);

        final EditText ageField  = (EditText) main.findViewById(R.id.age);

        final EditText skillsField  = (EditText) main.findViewById(R.id.skills);

        final EditText phoneField  = (EditText) main.findViewById(R.id.phone);

        sendButton = (Button) findViewById(R.id.validate);

        sendButton.setOnClickListener(

                new View.OnClickListener() {
                    public void onClick(View view) {

                        // get data back from form
                        lastName = lastNameField.getText().toString();
                        firstName = firstNameField.getText().toString();


                        if (Utilities.isNumeric(ageField.getText().toString()) && ageField.getText().toString().length() > 0)
                            age = Integer.parseInt(ageField.getText().toString());
                        else age = 0;

                        skills = skillsField.getText().toString();
                        phone = phoneField.getText().toString();

                        //that sh*t doesn't work...
                        Log.v(lastName, firstName);

                        Intent i = new Intent(MainActivity.this, Activity2.class);
                        // put "extras" into the bundle for access in the second activity
                        i.putExtra("lastName", lastName);
                        i.putExtra("firstName", firstName);
                        i.putExtra("age", age);
                        i.putExtra("skills", skills);
                        i.putExtra("phone", phone);

                        // brings up the second activity
                        startActivity(i);

                    }
                });
    }

}

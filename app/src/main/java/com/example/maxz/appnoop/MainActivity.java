package com.example.maxz.appnoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nameEditText, passwordEditText;
    String nameString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.editTextName);


    }//main method
}//main class

package com.example.maxz.appnoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

   private EditText nameEditText, passwordEditText;
   private String nameString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       nameEditText = (EditText) findViewById(R.id.editTextName);
        passwordEditText = (EditText) findViewById(R.id.editTextPassword);


    }//main method

    public void cicksigninActivity(View view) {

        nameString = nameEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        if (nameString.equals("") || passwordString.equals("")) {
            MyDialog myDialog = new MyDialog();
            myDialog.myAler(this,"มีช่องว่าง กรุณากรอกให้ครบนะจ๊ะ","ผิดพลาด");
        }

    }
}//main class

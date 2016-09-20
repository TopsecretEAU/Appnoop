package com.example.maxz.appnoop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

   private EditText nameEditText, passwordEditText;
   private String nameString, passwordString;
    private Button singupButton , signinButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.editTextName);
        passwordEditText = (EditText) findViewById(R.id.editTextPassword);
        signinButton = (Button) findViewById(R.id.btnsignin);
        singupButton = (Button) findViewById(R.id.btnsignup);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameString = nameEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                if (nameString.equals("") || passwordString.equals("")) {
                    MyDialog myDialog = new MyDialog();
                    myDialog.myAler(MainActivity.this,"มีช่องว่าง กรุณากรอกให้ครบนะจ๊ะ","ผิดพลาด");
                }

            }
        });

    }//main method

//    public void cicksigninActivity(View view) {
//
//        nameString = nameEditText.getText().toString().trim();
//        passwordString = passwordEditText.getText().toString().trim();
//
//        if (nameString.equals("") || passwordString.equals("")) {
//            MyDialog myDialog = new MyDialog();
//            myDialog.myAler(this,"มีช่องว่าง กรุณากรอกให้ครบนะจ๊ะ","ผิดพลาด");
//        }
//
//    }

    public void cicksignUPActivity(View view) {
        startActivity(new Intent(MainActivity.this,SignupActivity.class));
    }
}//main class

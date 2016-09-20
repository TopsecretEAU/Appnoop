package com.example.maxz.appnoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {


    // ประกาศ ตัวแปร
    private EditText nameEditText, surnameEditText, passwordEditText, repasswordEditText, emailEditText;
    private String nameString, surnameString, passwordString, repasswordString, emailString;
    // ประกาศตัวแปร

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        nameEditText = (EditText) findViewById(R.id.name);
        surnameEditText = (EditText) findViewById(R.id.surname);
        passwordEditText = (EditText) findViewById(R.id.password);
        repasswordEditText = (EditText) findViewById(R.id.repassword);
        emailEditText = (EditText) findViewById(R.id.edemail);
    } //main method

    // ประกาศ class
    public void Signupactivity(View view) {

        // แปลค่าจาก Editext เป็น String Editext > String
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        repasswordString = repasswordEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();

        // Chack ช่องว่าง
        if (nameString.equals("") || surnameString.equals("") || passwordString.equals("") || repasswordString.equals("")
        || emailString.equals("")) {
            MyDialog myDialog = new MyDialog();
            myDialog.myAler(this, "มีช่องว่าง", "กรุณากรอบทุกช่อง");

        } else if (!passwordString.equals(repasswordString)) {
            MyDialog myDialog = new MyDialog();
            myDialog.myAler(this ,"รหัสผ่านไม่ตรง" , "กรุณากรอกรหัสผ่าน");
        }
        }// chack ช่องว่าง





} // main class

package com.example.maxz.appnoop;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class ProductActivity extends AppCompatActivity {

    private EditText nameproductEditText,priceproductEditText, detailproductEditText;
    private String nameproductString,priceproductString, detailproductString,imageString;
    private ImageView productImageView;
    private boolean statusABoolean = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        nameproductEditText = (EditText) findViewById(R.id.editTextproductname);
        priceproductEditText = (EditText) findViewById(R.id.editTextproductprice);
        detailproductEditText = (EditText) findViewById(R.id.editTextproductdetail);
        productImageView = (ImageView) findViewById(R.id.imageView2);

        productImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent, "โปรดเลือกรูปภาพ"),1);
            }
        });


    }//main method

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}//main class

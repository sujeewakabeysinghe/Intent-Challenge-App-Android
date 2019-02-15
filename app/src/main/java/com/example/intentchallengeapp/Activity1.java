package com.example.intentchallengeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    ImageView iv1,iv2,iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        iv1=findViewById(R.id.iv1);
        iv2=findViewById(R.id.iv2);
        iv3=findViewById(R.id.iv3);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et1.getText().toString().isEmpty()||et2.getText().toString().isEmpty()||et3.getText().toString().isEmpty()||et4.getText().toString().isEmpty()){
                    Toast.makeText(Activity1.this,"fill all fields!",Toast.LENGTH_LONG).show();
                }
                else {
                    String name = et1.getText().toString().trim();
                    String number = et2.getText().toString().trim();
                    String web = et3.getText().toString().trim();
                    String address = et3.getText().toString().trim();

                    Intent in = new Intent();
                    in.putExtra("name", name);
                    in.putExtra("number", number);
                    in.putExtra("web", web);
                    in.putExtra("address", address);
                    setResult(RESULT_OK,in);
                    Activity1.this.finish();
                }
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et1.getText().toString().isEmpty()||et2.getText().toString().isEmpty()||et3.getText().toString().isEmpty()||et4.getText().toString().isEmpty()){
                    Toast.makeText(Activity1.this,"fill all fields!",Toast.LENGTH_LONG).show();
                }
                else {
                    String name = et1.getText().toString().trim();
                    String number = et2.getText().toString().trim();
                    String web = et3.getText().toString().trim();
                    String address = et3.getText().toString().trim();

                    Intent in = new Intent();
                    in.putExtra("name", name);
                    in.putExtra("number", number);
                    in.putExtra("web", web);
                    in.putExtra("address", address);
                    setResult(RESULT_OK,in);
                    Activity1.this.finish();
                }
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et1.getText().toString().isEmpty()||et2.getText().toString().isEmpty()||et3.getText().toString().isEmpty()||et4.getText().toString().isEmpty()){
                    Toast.makeText(Activity1.this,"fill all fields!",Toast.LENGTH_LONG).show();
                }
                else {
                    String name = et1.getText().toString().trim();
                    String number = et2.getText().toString().trim();
                    String web = et3.getText().toString().trim();
                    String address = et3.getText().toString().trim();

                    Intent in = new Intent();
                    in.putExtra("name", name);
                    in.putExtra("number", number);
                    in.putExtra("web", web);
                    in.putExtra("address", address);
                    setResult(RESULT_OK,in);
                    Activity1.this.finish();
                }
            }
        });

    }
}

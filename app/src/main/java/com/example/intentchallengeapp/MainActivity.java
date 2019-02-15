package com.example.intentchallengeapp;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView tv1;
    ImageView iv1,iv2,iv3;
    final int ac1=1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==ac1){
            if(resultCode==RESULT_OK){
                String name=data.getStringExtra("name");
                final String number=data.getStringExtra("number");
                final String web=data.getStringExtra("web");
                final String address=data.getStringExtra("address");
                tv1.setText(name);
                tv1.setVisibility(View.VISIBLE);
                iv1.setVisibility(View.VISIBLE);
                iv2.setVisibility(View.VISIBLE);
                iv3.setVisibility(View.VISIBLE);

                iv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                        startActivity(in);
                    }
                });
                iv2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+address));
                        startActivity(in);
                    }
                });
                iv3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+web));
                        startActivity(in);
                    }
                });

            }
            if(resultCode==RESULT_CANCELED){
                tv1.setText("not data entered!");
                tv1.setVisibility(View.VISIBLE);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        tv1=findViewById(R.id.tv1);
        iv1=findViewById(R.id.iv1);
        iv2=findViewById(R.id.iv2);
        iv3=findViewById(R.id.iv3);
        tv1.setVisibility(View.GONE);
        iv1.setVisibility(View.GONE);
        iv2.setVisibility(View.GONE);
        iv3.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in=new Intent(MainActivity.this,com.example.intentchallengeapp.Activity1.class);
                startActivityForResult(in,ac1);

            }
        });

    }
}

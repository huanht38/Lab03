package com.example.lap_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        ImageView imageView_sanPham= findViewById(R.id.imageView_main);
        ImageView imageView_xanhDuong= findViewById(R.id.imageView_xanhDuong);
        ImageView imageView_do= findViewById(R.id.imageView_do);
        ImageView imageView_den= findViewById(R.id.imageView_den);
        ImageView imageView_xanhDen= findViewById(R.id.imageView_xanhDen);

        Button btnXong= findViewById(R.id.button_xong);


        imageView_xanhDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_sanPham.setImageResource(R.drawable.vs_bac);
                index=R.drawable.vs_bac;
            }
        });

        imageView_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_sanPham.setImageResource(R.drawable.vs_do);
                index=R.drawable.vs_do;
            }
        });

        imageView_den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_sanPham.setImageResource(R.drawable.vs_den);
                index=R.drawable.vs_den;
            }
        });

        imageView_xanhDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_sanPham.setImageResource(R.drawable.vs_xanh);
                index=R.drawable.vs_xanh;
            }
        });

        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.putExtra("index", index);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
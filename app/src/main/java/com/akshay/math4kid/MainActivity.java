package com.akshay.math4kid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    AppCompatButton button_1,button_2,button_3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1=(AppCompatButton)findViewById(R.id.btn_1);
        button_2=(AppCompatButton)findViewById(R.id.btn_2);
        button_3=(AppCompatButton)findViewById(R.id.btn_3);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.btn_1 :
            Intent new_1=new Intent(this,Counting.class);
                startActivity(new_1);
                break;

            case R.id.btn_2 :
                Intent new_2= new Intent(this,Addition.class);
                startActivity(new_2);
                break;

            case R.id.btn_3 :
                Intent new_3= new Intent(this,Substraction.class);
                startActivity(new_3);
                break;
        }


    }

}

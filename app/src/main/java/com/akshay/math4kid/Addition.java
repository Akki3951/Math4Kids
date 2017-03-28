package com.akshay.math4kid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    EditText number1,number2;
    TextView result;
    AppCompatButton button_add;
    Integer no1,no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        result = (TextView)findViewById(R.id.addresult);

        button_add=(AppCompatButton)findViewById(R.id.additionButton);
        button_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(number1.getText().toString());
                no2 = Integer.parseInt(number2.getText().toString());
                result.setText(no1 + no2 + "");
            }
        });
    }

}



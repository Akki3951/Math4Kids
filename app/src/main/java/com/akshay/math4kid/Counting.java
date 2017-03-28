package com.akshay.math4kid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Counting extends AppCompatActivity {

    TextView count_value;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;
    AppCompatButton button_add,button_subtract;
    Integer _counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);

        count_value=(TextView)findViewById(R.id.count);

        img1=(ImageView)findViewById(R.id.img_1);
        img2=(ImageView)findViewById(R.id.img_2);
        img3=(ImageView)findViewById(R.id.img_3);
        img4=(ImageView)findViewById(R.id.img_4);
        img5=(ImageView)findViewById(R.id.img_5);
        img6=(ImageView)findViewById(R.id.img_6);
        img7=(ImageView)findViewById(R.id.img_7);
        img8=(ImageView)findViewById(R.id.img_8);
        img9=(ImageView)findViewById(R.id.img_9);
        img10=(ImageView)findViewById(R.id.img_10);
        button_add=(AppCompatButton)findViewById(R.id.add);
        button_subtract=(AppCompatButton)findViewById(R.id.subtract);
        button_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                _counter++;
                increase(_counter);
            }
        });
        button_subtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                _counter--;
                decrease(_counter);
            }
        });
    }
    private void increase(Integer a) {
               if(a.equals(1)) {
                   img1.setVisibility(View.VISIBLE);
                   count_value.setText("गिनती : १");
               }
                if(a.equals(2)) {
                    img2.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : २");
                }
                if(a.equals(3)) {
                     img3.setVisibility(View.VISIBLE);
                     count_value.setText("गिनती : ३");
                }
                if(a.equals(4)) {
                    img4.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : ४");
                }
                if(a.equals(5)) {
                    img5.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : ५");
        }
                if(a.equals(6)) {
                    img6.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : ६");

        }
                if(a.equals(7)) {
                    img7.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : ७");

        }
                if(a.equals(8)) {
                    img8.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : ८");
        }
                if(a.equals(9)) {
                    img9.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : ९");
        }
               if(a.equals(10)) {
                    img10.setVisibility(View.VISIBLE);
                    count_value.setText("गिनती : १०");
        }
    }

    private void decrease(Integer a) {
        if(a.equals(0)) {
            img1.setVisibility(View.GONE);
            count_value.setText("गिनती : 0");
        }
        if(a.equals(1)) {
            img2.setVisibility(View.GONE);
            count_value.setText("गिनती : १");
        }
        if(a.equals(2)) {
            img3.setVisibility(View.GONE);
            count_value.setText("गिनती : २");
        }
        if(a.equals(3)) {
            img4.setVisibility(View.GONE);
            count_value.setText("गिनती : ३");
        }
        if(a.equals(4)) {
            img5.setVisibility(View.GONE);
            count_value.setText("गिनती : ४");
        }
        if(a.equals(5)) {
            img6.setVisibility(View.GONE);
            count_value.setText("गिनती : ५");
        }
        if(a.equals(6)) {
            img7.setVisibility(View.GONE);
            count_value.setText("गिनती : ६");
        }
        if(a.equals(7)) {
            img8.setVisibility(View.GONE);
            count_value.setText("गिनती : ७");
        }
        if(a.equals(8)) {
            img9.setVisibility(View.GONE);
            count_value.setText("गिनती : ८");
        }
        if(a.equals(9)) {
            img10.setVisibility(View.GONE);
            count_value.setText("गिनती : ९");
        }

	}
}



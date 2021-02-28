package com.kararjabbar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @SuppressLint("SetTextI18n")
    public void getyear(View view) {
        EditText etyearold = findViewById(R.id.etyearold);
        EditText etyearnow = findViewById(R.id.etyearnow);
        EditText etmonthold = findViewById(R.id.etmonthold);
        EditText etmonthnow = findViewById(R.id.etmonthnow);
        EditText etdayold = findViewById(R.id.etdayold);
        EditText etdaynow = findViewById(R.id.etdaynow);
        Button buyearold = findViewById(R.id.buyear);

 if (TextUtils.isEmpty(etyearold.getText().toString())) {
            etyearold.getError();
            etyearold.setError("Please Enter Number");
        } if (TextUtils.isEmpty(etyearnow.getText().toString())) {
            etyearnow.getError();
            etyearnow.setError("Please Enter Number");
        } if (TextUtils.isEmpty(etmonthold.getText().toString())) {
            etmonthold.getError();
            etmonthold.setError("Please Enter Number");
        } if (TextUtils.isEmpty(etmonthnow.getText().toString())) {
            etmonthnow.getError();
            etmonthnow.setError("Please Enter Number");
        } if (TextUtils.isEmpty(etdayold.getText().toString())) {
            etdayold.getError();
            etdayold.setError("Please Enter Number");
        } if (TextUtils.isEmpty(etdaynow.getText().toString())) {
            etdaynow.getError();
            etdaynow.setError("Please Enter Number");
        }
        if (TextUtils.isEmpty(etdayold.getText().toString()) || TextUtils.isEmpty(etdaynow.getText().toString()) || TextUtils.isEmpty(etmonthold.getText().toString()) || TextUtils.isEmpty(etmonthnow.getText().toString()) || TextUtils.isEmpty(etyearold.getText().toString()) || TextUtils.isEmpty(etyearnow.getText().toString()))
        {
            buyearold.setText("Please Try Again");
        }

        else {
            int year = Integer.parseInt(etyearold.getText().toString());
            int year1 = Integer.parseInt(etyearnow.getText().toString());
            int age = year1 - year;

            int month = Integer.parseInt(etmonthold.getText().toString());
            int month1 = Integer.parseInt(etmonthnow.getText().toString());
            int month2 = month1 - month;

            int day = Integer.parseInt(etdayold.getText().toString());
            int day1 = Integer.parseInt(etdaynow.getText().toString());
            int day2 = day1 - day;

            if (age >= 0 && age <= 100 && month2 >= 0 && month2 <= 12 && day2 >= 0 && day2 <= 31) {
                buyearold.setText("Age:" + age + "Years" + "," + month2 + "Month" + "," + day2 + "Day");
            }

            else if (day <= 0 || day > 31) {
                etdayold.getError();
                etdayold.setError("Error Please Try Again");
            } else if (day1 <= 0 || day1 > 31) {
                etdaynow.getError();
                etdaynow.setError("Error Please Try Again");
            } else if (month <= 0 || month > 12) {
                etmonthold.getError();
                etmonthold.setError("Error Please Try Again");
            } else if (month1 <= 0 || month1 > 12) {
                etmonthnow.getError();
                etmonthnow.setError("Error Please Try Again");
            } else if (year <= 1900 || year > 2020) {
                etyearold.getError();
                etyearold.setError("Error Please Try Again");
            } else if (year1 <= 2019 || year1 > 2050) {
                etyearnow.getError();
                etyearnow.setError("Error Please Try Again");
            }  else if (month2 < 0) {
                int errmonth = 12 + month2;
                int errage = age - 1;
                //int errrday = day1 + 30;
                buyearold.setText("Age:" + errage + "Years" + "," + errmonth + "Month" + "," + day2 + "Day");
            } else if (month2 > 12) {
                int ermonth = month2 - 12;
                int erage = age + 1;
                int errrrday = (day1 - 30);
                buyearold.setText("Age:" + erage + "Years" + "," + ermonth + "Month" + "," + day2 + "Day");
            } else if (day2 < 0) {
                int erday = day2 + 30;
                int errrmonth = month2 - 1;
                buyearold.setText("Age:" + age + "Years" + "," + errrmonth + "Month" + "," + erday + "Day");
            } else if (day2 > 31) {
                int errday = day2 - 30;
                int errrrmonth = month2 + 12;
                buyearold.setText("Age:" + age + "Years" + "," + errrrmonth + "Month" + "," + errday + "Day");
            }


        }
    }
}
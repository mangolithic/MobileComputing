package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewInput = findViewById(R.id.numberInput);
    }


    @SuppressLint("NonConstantResourceId")
    public void btnClick (View v) {
        String input = textViewInput.getText().toString();
        switch (v.getId()) {
            case R.id.btnZero:
                input += "0";
                break;
            case R.id.btnOne:
                input += "1";
                break;
            case R.id.btnTwo:
                input += "2";
                break;
            case R.id.btnThree:
                input += "3";
                break;
            case R.id.btnFour:
                input += "4";
                break;
            case R.id.btnFive:
                input += "5";
                break;
            case R.id.btnSix:
                input += "6";
                break;
            case R.id.btnSeven:
                input += "7";
                break;
            case R.id.btnEight:
                input += "8";
                break;
            case R.id.btnNine:
                input += "9";
                break;
            case R.id.btnClear:
                input =  "";
                break;
        }
        textViewInput.setText(input);
    }
}
package com.madantiwari.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etWeight, etHeight;
    TextView result;
    Button btncalc;
    Float Height, Weight, BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWeight = findViewById(R.id.etWgt);
        etHeight = findViewById(R.id.etHgt);
        result = findViewById(R.id.tvResult);
        btncalc = findViewById(R.id.btnCalc);
        btncalc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etWeight.getText().toString())) {
            etWeight.setError("Please Enter Weight");
            return;
        } else if (TextUtils.isEmpty(etHeight.getText().toString())) {
            etHeight.setError("Please Enter Height");
            return;
        }

        Height=Float.parseFloat(etHeight.getText().toString());
        Weight=Float.parseFloat(etWeight.getText().toString());
        BMI= Weight/(Height*Height);

        result.setText(""+BMI);

        Intent intent=new Intent();
        intent = new Intent(MainActivity.this, BMIActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("Ans", BMI+"");
        intent.putExtras(bundle);
        startActivity(intent);

    }

}

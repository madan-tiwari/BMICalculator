package com.madantiwari.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    TextView tvfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Bundle bundle=getIntent().getExtras();
        float stuff=Float.parseFloat(bundle.getString("Ans"));
        tvfinal=findViewById(R.id.tvFinal);

        if (stuff<=16)
        {
            tvfinal.setText("Severe thickness");
        }
        else if(stuff>16 && stuff<=17)
        {
            tvfinal.setText("Moderate thickness");
        }
        else if(stuff>17 && stuff<=18.5)
        {
            tvfinal.setText("Mild thickness");
        }
        else if(stuff>18.5 && stuff<=25)
        {
            tvfinal.setText("Normal");
        }
        else if(stuff>25 && stuff<=30)
        {
            tvfinal.setText("Overweight");
        }
        else if(stuff>30)
        {
            tvfinal.setText("Obese class");
        }


    }
}

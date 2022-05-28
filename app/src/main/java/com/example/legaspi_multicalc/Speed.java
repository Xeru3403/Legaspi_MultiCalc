package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Speed extends AppCompatActivity implements View.OnClickListener {

    Button CalculateSpeed;
    EditText DistanceInput, TimeInput;
    TextView SpeedResult, Input;

    //Speed
    Methods UwU = new Methods();
    Variables UmU = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        CalculateSpeed = findViewById(R.id.CalculateSpeed);
        DistanceInput = findViewById(R.id.DistanceInput);
        TimeInput = findViewById(R.id.TimeInput);
        SpeedResult = findViewById(R.id.SpeedResult);
        Input = findViewById(R.id.Input);


        CalculateSpeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CalculateSpeed:
                UmU.setDistance(Double.parseDouble(DistanceInput.getText().toString()));
                UmU.setTime(Double.parseDouble(TimeInput.getText().toString()));
                double period5 = UwU.cal_speed(UmU.getDistance(), UmU.getTime());
                SpeedResult.setText("" + period5);
                break;

        }
    }
}
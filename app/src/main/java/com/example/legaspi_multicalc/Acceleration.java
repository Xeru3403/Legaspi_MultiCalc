package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Acceleration extends AppCompatActivity implements View.OnClickListener {

    Button CalculateAcceleration;
    EditText TimeInput, VelocityInput;
    TextView AccelerationResult, Input;

    //Acceleration
    Methods UwU = new Methods();
    Variables UmU = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);
        CalculateAcceleration = findViewById(R.id.CalculateAcceleration);
        TimeInput = findViewById(R.id.TimeInput);
        VelocityInput = findViewById(R.id.VelocityInput);
        AccelerationResult = findViewById(R.id.AccelerationResult);
        Input = findViewById(R.id.Input);


        CalculateAcceleration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CalculateAcceleration:
                UmU.setLength(Double.parseDouble(TimeInput.getText().toString()));
                UmU.setWidth(Double.parseDouble(VelocityInput.getText().toString()));
                double period = UwU.acceleration(UmU.getTime(), UmU.getVelocity());
                AccelerationResult.setText("" + period);
                break;

        }
    }
}
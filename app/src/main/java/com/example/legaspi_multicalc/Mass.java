package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mass extends AppCompatActivity implements View.OnClickListener {

    Button CalculateMass;
    EditText DensityInput, VolumeInput;
    TextView MassResult, Input;

    //Mass
    Methods UwU = new Methods();
    Variables UmU = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        CalculateMass = findViewById(R.id.CalculateMass);
        DensityInput = findViewById(R.id.DensityInput);
        VolumeInput = findViewById(R.id.VolumeInput);
        MassResult = findViewById(R.id.MassResult);
        Input = findViewById(R.id.Input);


        CalculateMass.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CalculateMass:
                UmU.setLength(Double.parseDouble(DensityInput.getText().toString()));
                UmU.setWidth(Double.parseDouble(VolumeInput.getText().toString()));
                double period8 = UwU.Mass(UmU.getDensity(), UmU.getVolume());
                MassResult.setText("" + period8);
                break;

        }
    }
}
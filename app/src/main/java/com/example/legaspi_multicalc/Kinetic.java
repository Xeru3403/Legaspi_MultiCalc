package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Kinetic extends AppCompatActivity implements View.OnClickListener {

    Button CalculateKineticEnergy;
    EditText MassInput, Velocity1Input, Velocity2Input;
    TextView KineticEnergyResult, Input;

    //Trapezoid
    Methods UwU = new Methods();
    Variables UmU = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetic);
        CalculateKineticEnergy = findViewById(R.id.CalculateTriangle);
        MassInput = findViewById(R.id.MassInput);
        Velocity1Input = findViewById(R.id.Velocity1Input);
        Velocity2Input = findViewById(R.id.Velocity2Input);
        KineticEnergyResult = findViewById(R.id.KineticEnergyResult);
        Input = findViewById(R.id.Input);


        CalculateKineticEnergy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.CalculateKineticEnergy:
                UmU.setM(Double.parseDouble(MassInput.getText().toString()));
                UmU.setVelocity(Double.parseDouble(Velocity1Input.getText().toString()));
                UmU.setVelocity(Double.parseDouble(Velocity2Input.getText().toString()));
                double period7 = UwU.kineticEnergy(UmU.getM(),UmU.getVelocity());
                KineticEnergyResult.setText("" + period7);
                break;
    }
}
}
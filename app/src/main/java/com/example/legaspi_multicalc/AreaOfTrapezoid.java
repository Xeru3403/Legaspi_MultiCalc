package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfTrapezoid extends AppCompatActivity implements View.OnClickListener {

    Button CalculateTrapezoid;
    EditText Base1Input, Base2Input, HeightInput;
    TextView TrapezoidResult, Input;

    //Trapezoid
    Methods UwU = new Methods();
    Variables UmU = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_trapezoid);
        CalculateTrapezoid = findViewById(R.id.CalculateTriangle);
        Base1Input = findViewById(R.id.BaseInput);
        Base2Input = findViewById(R.id.Base2Input);
        HeightInput = findViewById(R.id.HeightInput);
        TrapezoidResult = findViewById(R.id.TrapezoidResult);
        Input = findViewById(R.id.Input);

        CalculateTrapezoid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CalculateTrapezoid:
                UmU.setB1(Double.parseDouble(Base1Input.getText().toString()));
                UmU.setB2(Double.parseDouble(Base2Input.getText().toString()));
                UmU.setH(Double.parseDouble(HeightInput.getText().toString()));
                double period4 = UwU.Trapezoid(UmU.getB1(),UmU.getB2(),UmU.getH());
                TrapezoidResult.setText("" + period4);
                break;

        }
    }
}
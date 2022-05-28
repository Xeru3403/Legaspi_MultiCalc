package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfTriangle extends AppCompatActivity implements View.OnClickListener {


    Button CalculateTriangle;
    EditText BaseInput, HeightInput;
    TextView TriangleResult, Input;

    //Triangle
    Methods UwU = new Methods();
    Variables UmU = new Variables();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_triangle);
        CalculateTriangle = findViewById(R.id.CalculateTriangle);
        BaseInput = findViewById(R.id.BaseInput);
        HeightInput = findViewById(R.id.HeightInput);
        TriangleResult = findViewById(R.id.TriangleResult);
        Input = findViewById(R.id.Input);

        CalculateTriangle.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CalculateTriangle:
                UmU.setBase(Double.parseDouble(BaseInput.getText().toString()));
                UmU.setHeight(Double.parseDouble(HeightInput.getText().toString()));
                double period3 = UwU.triangle(UmU.getBase(), UmU.getHeight());
                TriangleResult.setText("" + period3);
                break;
        }
    }
}
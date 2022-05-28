package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfRectangle extends AppCompatActivity implements View.OnClickListener {

    Button CalculateRectangle;
    EditText LengthInput, WidthInput;
    TextView RectangleResult, Input;

    //Rectangle
    Methods UwU = new Methods();
    Variables UmU = new Variables();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_rectangle);
        CalculateRectangle = findViewById(R.id.CalculateRectangle);
        LengthInput = findViewById(R.id.LengthInput);
        WidthInput = findViewById(R.id.WidthInput);
        RectangleResult = findViewById(R.id.RectangleResult);
        Input = findViewById(R.id.Input);

        CalculateRectangle.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.CalculateRectangle:
                UmU.setLength(Double.parseDouble(LengthInput.getText().toString()));
                UmU.setWidth(Double.parseDouble(WidthInput.getText().toString()));
                double period = UwU.rectangle(UmU.getLength(),UmU.getWidth());
                RectangleResult.setText(""+period);
                break;

        }

    }
}
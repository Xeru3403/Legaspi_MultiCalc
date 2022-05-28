package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfSquare extends AppCompatActivity implements View.OnClickListener{

    Button CalculateSquare;
    EditText SquareInput;
    TextView SquareResult;

    //Square
    Methods UwU = new Methods();
    Variables UmU = new Variables();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_square);
        CalculateSquare = findViewById(R.id.CalculateSquare);
        SquareInput = findViewById(R.id.SquareInput);
        SquareResult = findViewById(R.id.SquareResult);

        CalculateSquare.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.CalculateSquare:
                UmU.setSquare(Double.parseDouble(SquareInput.getText().toString()));
                double period = UwU.square(UmU.getSquare(),UmU.getSquare());
                SquareResult.setText(""+period);
                break;


        }

    }
}
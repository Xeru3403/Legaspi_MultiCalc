package com.example.legaspi_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button AOS, AOT, AOR, AOTr, Kinetic, Mass, Speed, Acceleration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AOS = findViewById(R.id.AOS);
        AOT = findViewById(R.id.AOT);
        AOR = findViewById(R.id.AOR);
        AOTr = findViewById(R.id.AOTr);
        Kinetic = findViewById(R.id.Kinetic);
        Mass = findViewById(R.id.Mass);
        Speed = findViewById(R.id.Speed);
        Acceleration = findViewById(R.id.Acceleration);

        AOS.setOnClickListener(this);
        AOT.setOnClickListener(this);
        AOR.setOnClickListener(this);
        AOTr.setOnClickListener(this);
        Kinetic.setOnClickListener(this);
        Mass.setOnClickListener(this);
        Speed.setOnClickListener(this);
        Acceleration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.AOS:
                Intent intent = new Intent(MainActivity.this,AreaOfSquare.class);
                startActivity(intent);
                break;

                case R.id.AOR:
                    Intent intent2 = new Intent(MainActivity.this,AreaOfRectangle.class);
                    startActivity(intent2);
                    break;

            case R.id.AOT:
                    Intent intent3 = new Intent(MainActivity.this,AreaOfTriangle.class);
                    startActivity(intent3);
                    break;

            case R.id.AOTr:
                Intent intent4 = new Intent(MainActivity.this,AreaOfTrapezoid.class);
                startActivity(intent4);
                break;

            case R.id.Speed:
                Intent intent5 = new Intent(MainActivity.this,Speed.class);
                startActivity(intent5);
                break;

            case R.id.Acceleration:
                Intent intent6 = new Intent(MainActivity.this,Acceleration.class);
                startActivity(intent6);
                break;

            case R.id.Mass:
                Intent intent7 = new Intent(MainActivity.this,Mass.class);
                startActivity(intent7);
                break;

            case R.id.Kinetic:
                Intent intent8 = new Intent(MainActivity.this,Kinetic.class);
                startActivity(intent8);
                break;

            }
        }

    }

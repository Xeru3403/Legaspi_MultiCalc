package com.example.legaspi_multicalc;

public class Methods {
    //Geometry//
    //Formula For Square//
    public double square(double square, double answer) {
        answer = square * square;
        return (answer);
    }

    //Formula For Rectangle//
    public double rectangle(double length, double width) {
        return length * width;
    }

    //Formula For Triangle//
    public double triangle(double base, double height) {
        return base * height / 2;
    }

    //Formula For Trapezoid
    public double Trapezoid(double b1,
                            double b2,
                            double h)
    {
        return ((b1 + b2) / 2) * h;
    }
    //Physics//
    //Formula For Mass//
    public double Mass(double density, double volume) {
        return density * volume;
    }

    //Formula For KineticEnergy//
    public double kineticEnergy(double Mass, double Velocity) {

        // Stores the Kinetic Energy
        double KineticEnergy;

        KineticEnergy = 0.5 * Mass * Velocity * Velocity;

        return KineticEnergy;
    }

    //Formula For Speed//
    public double cal_speed(double distance, double time)
    {
        return distance / time;
    }

    //Formula For Acceleration//
    public double acceleration(double time,double velocity) {
        return time / velocity;
    }
}

package org.Cars;
import java.io.*;

public class CarInformation implements Serializable{
    String vin, make, model;
    Integer mileage, mph, mpg;

    public CarInformation(String vin, String make, String model, Integer mileage, Integer mph, Integer mpg)
    {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.mph = mph;
        this.mpg = mpg;
    }
}

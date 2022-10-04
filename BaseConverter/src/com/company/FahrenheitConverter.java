package com.company;

public class FahrenheitConverter implements Converter{
    @Override
    public double getConvertedValue(double Value) {
        double F= Value*1.8 + 32;
        return F;
    }
}

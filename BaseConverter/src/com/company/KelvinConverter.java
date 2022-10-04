package com.company;

public class KelvinConverter implements Converter{
    double T;
    @Override
    public double getConvertedValue(double Value) {
         T=  Value+273;
        return T;

    }

    @Override
    public String toString() {
        return "KelvinConverter{" +
                "T=" + T +
                "K" + '}';
    }
}

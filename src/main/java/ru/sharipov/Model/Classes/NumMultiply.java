package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ArithmeticOperation;

public class NumMultiply implements ArithmeticOperation {

    @Override
    public ComplexNumber doArithmeticOperation(ComplexNumber a, ComplexNumber b) {
        System.out.println();
        Double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        ComplexNumber complexNumber;
        if (imaginary == 0) {
            complexNumber = new ComplexNumber(real);
        } else {
            complexNumber = new ComplexNumber(real, imaginary);
        }
        return complexNumber;
    }
}

package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ArithmeticOperation;

public class NumDivide implements ArithmeticOperation {

    @Override
    public ComplexNumber doArithmeticOperation(ComplexNumber a, ComplexNumber b) {
        System.out.println();
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getReal()) / denominator;
        ComplexNumber complexNumber;
        if (imaginary == 0) {
            complexNumber = new ComplexNumber(real);
        } else {
            complexNumber = new ComplexNumber(real, imaginary);
        }
        return complexNumber;
    }
}

package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ArithmeticOperation;

public class NumSum implements ArithmeticOperation {

    @Override
    public ComplexNumber doArithmeticOperation(ComplexNumber a, ComplexNumber b) {
        System.out.println();
        Double real = a.getReal() + b.getReal();
        Double imaginary = a.getImaginary() + b.getImaginary();
        ComplexNumber complexNumber;
        if (imaginary == 0) {
            complexNumber = new ComplexNumber(real);
        } else {
            complexNumber = new ComplexNumber(real, imaginary);
        }
        return complexNumber;
    }
}

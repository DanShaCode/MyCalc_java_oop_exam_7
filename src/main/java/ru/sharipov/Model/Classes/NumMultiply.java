package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ArithmeticOperation;

public class NumMultiply implements ArithmeticOperation {

    @Override
    public ComplexNumber doArithmeticOperation(ComplexNumber a, ComplexNumber b) {
        Double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        Double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        if (imaginary == 0) {
            ComplexNumber complexNumber = new ComplexNumber(real);
            return complexNumber;
        } else {
            ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
            return complexNumber;
        }
    }
}

package ru.sharipov.Model.Classes;

import lombok.Data;
import ru.sharipov.Model.Interfaces.ArithmeticOperation;

@Data
public class NumDifference implements ArithmeticOperation {

    private String sign = "-";

    @Override
    public ComplexNumber doArithmeticOperation(ComplexNumber a, ComplexNumber b) {
        System.out.println();
        Double real = a.getReal() - b.getReal();
        Double imaginary = a.getImaginary() - b.getImaginary();
        ComplexNumber complexNumber;
        if (imaginary == 0) {
            complexNumber = new ComplexNumber(real);
        } else {
            complexNumber = new ComplexNumber(real, imaginary);
        }
        return complexNumber;
    }
}

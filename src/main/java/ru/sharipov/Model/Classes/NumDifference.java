package ru.sharipov.Model.Classes;

import lombok.Data;
import ru.sharipov.Model.Interfaces.ArithmeticOperation;

@Data
public class NumDifference implements ArithmeticOperation {

    private String sign = "-";

    @Override
    public ComplexNumber doArithmeticOperation(ComplexNumber a, ComplexNumber b) {
        return null;
    }
}

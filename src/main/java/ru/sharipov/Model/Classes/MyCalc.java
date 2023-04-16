package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Abstract.Calculator;
import ru.sharipov.Model.Interfaces.ArithmeticOperation;


public class MyCalc extends Calculator {

    @Override
    public ComplexNumber doArithmeticOperation(ArithmeticOperation arithmeticOperation, ComplexNumber a, ComplexNumber b) {
        ComplexNumber newComplexNumber = arithmeticOperation.doArithmeticOperation(a,b);
        return newComplexNumber;
    }
}

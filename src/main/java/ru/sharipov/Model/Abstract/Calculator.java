package ru.sharipov.Model.Abstract;

import ru.sharipov.Model.Classes.ComplexNumber;
import ru.sharipov.Model.Interfaces.ArithmeticOperation;

public abstract class Calculator {
    public abstract ComplexNumber doArithmeticOperation(ArithmeticOperation arithmeticOperation, ComplexNumber a, ComplexNumber b);
}

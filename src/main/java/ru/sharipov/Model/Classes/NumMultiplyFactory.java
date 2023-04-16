package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ArithmeticOperation;
import ru.sharipov.Model.Interfaces.ArithmeticOperationFactory;

public class NumMultiplyFactory implements ArithmeticOperationFactory {

    @Override
    public ArithmeticOperation createOperation() {
        return new NumMultiply();
    }
}

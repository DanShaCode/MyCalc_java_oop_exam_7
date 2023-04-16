package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ArithmeticOperation;
import ru.sharipov.Model.Interfaces.ArithmeticOperationFactory;

public class NumDifferenceFactory implements ArithmeticOperationFactory {
    @Override
    public ArithmeticOperation createOperation() {
        return new NumDifference();
    }
}

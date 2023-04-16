package ru.sharipov.Control;

import ru.sharipov.Model.Classes.*;
import ru.sharipov.Model.Interfaces.ArithmeticOperation;
import ru.sharipov.Model.Interfaces.ArithmeticOperationFactory;

import java.util.Scanner;

public class Controller {
    public Controller() {
        CalcLog calcLog = new CalcLog();
        MyCalc myCalc = new MyCalc();
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperationFactory arithmeticOperationFactory;
        System.out.print("Введите число: ");
        Integer userInput = Integer.parseInt(scanner.nextLine());
        switch (userInput) {
            case 1 -> {
                arithmeticOperationFactory = new NumSumFactory();
                ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                myCalc.doArithmeticOperation(arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
            }
            case 2 -> {
                arithmeticOperationFactory = new NumDifferenceFactory();
                ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                myCalc.doArithmeticOperation(arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
            }
            case 3 -> {
                arithmeticOperationFactory = new NumMultiplyFactory();
                ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                        arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                System.out.println(complexNumber);
            }
            case 4 -> {
                arithmeticOperationFactory = new NumDivideFactory();
                ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                myCalc.doArithmeticOperation(arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
            }
        }
        scanner.close();
    }
}

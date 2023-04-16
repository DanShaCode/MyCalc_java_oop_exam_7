package ru.sharipov.Control;

import ru.sharipov.Model.Classes.*;
import ru.sharipov.Model.Interfaces.ArithmeticOperation;
import ru.sharipov.Model.Interfaces.ArithmeticOperationFactory;
import ru.sharipov.View.ConsoleView;

import java.util.Scanner;

public class Controller {
    public Controller() {
        CalcLog calcLog = new CalcLog();
        ConsoleView consoleView = new ConsoleView();
        MyCalc myCalc = new MyCalc();
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperationFactory arithmeticOperationFactory;
        int userInput = 0;
        while (userInput != 6) {
            consoleView.calcMenu();
            calcLog.getLogger().info("Меню успешно запущено");
            userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1 -> {
                    calcLog.getLogger().info("Пользователь выбрал сложение");
                    arithmeticOperationFactory = new NumSumFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.println();
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    System.out.println();
                    calcLog.getLogger().info("Суммирование прошло успешно");
                }
                case 2 -> {
                    calcLog.getLogger().info("Пользователь выбрал вычитание");
                    arithmeticOperationFactory = new NumDifferenceFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.println();
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Вычитание прошло успешно");
                }
                case 3 -> {
                    calcLog.getLogger().info("Пользователь выбрал умножение");
                    arithmeticOperationFactory = new NumMultiplyFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.println();
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Умножение прошло успешно");
                }
                case 4 -> {
                    calcLog.getLogger().info("Пользователь выбрал деление");
                    arithmeticOperationFactory = new NumDivideFactory();
                    ArithmeticOperation arithmeticOperation = arithmeticOperationFactory.createOperation();
                    ComplexNumber complexNumber = myCalc.doArithmeticOperation(
                            arithmeticOperation, new ComplexNumber(scanner), new ComplexNumber(scanner));
                    System.out.println();
                    System.out.print("Результат: ");
                    consoleView.viewOnConsole(complexNumber);
                    calcLog.getLogger().info("Деление прошло успешно");
                }
            }
        }
        scanner.close();
        calcLog.getLogger().info("Приложение успешно завершено");
    }
}

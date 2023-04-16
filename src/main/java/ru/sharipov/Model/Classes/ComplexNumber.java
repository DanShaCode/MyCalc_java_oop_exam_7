package ru.sharipov.Model.Classes;

import lombok.Data;

import java.util.Scanner;

@Data
public class ComplexNumber {
    private Double real;
    private Double imaginary;

    public ComplexNumber(Scanner scanner) {
        System.out.println();
        System.out.print("Введите вещественную часть: ");
        Double real = Double.parseDouble(scanner.nextLine());
        this.real = real;
        System.out.print("Введите мнимое число: ");
        Double imaginary = Double.parseDouble(scanner.nextLine());
        this.imaginary = imaginary;
        if (this.imaginary == 0) System.out.println("Сформированное число: "
                + getReal());
        if (this.imaginary < 0) System.out.println("Сформированное число: "
                + getReal() + "-" + Math.abs(getImaginary()) + "i");
        if (this.imaginary > 0) System.out.println("Сформированное число: "
                + getReal() + "+" + Math.abs(getImaginary()) + "i");
    }

    public ComplexNumber(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(Double real) {
        this.real = real;
        this.imaginary = 0.0;
    }

    public String toString() {
        if (imaginary == 0) return getReal().toString();
        if (imaginary < 0) return getReal() + "-" + Math.abs(getImaginary()) + "i";
        if (imaginary > 0) return getReal() + "+" + Math.abs(getImaginary()) + "i";
        return null;
    }

}

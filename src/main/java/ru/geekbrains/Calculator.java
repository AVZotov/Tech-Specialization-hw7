package ru.geekbrains;

public class Calculator {
    public static <T1 extends Number, T2 extends Number> double sum(T1 value1, T2 value2){
        return ((double) value1 + (double)value2);
    }

    public static <T1 extends Number, T2 extends Number> double multiply(T1 value1, T2 value2){
        return ((double) value1 * (double)value2);
    }

    public static <T1 extends Number, T2 extends Number> double divide(T1 value1, T2 value2){
        double checkValue = (double)value2;
        if (checkValue == 0){
            throw new ArithmeticException();
        }
        return ((double) value1 / checkValue);
    }

    public static <T1 extends Number, T2 extends Number> double subtract(T1 value1, T2 value2){
        return ((double) value1 - (double)value2);
    }
}

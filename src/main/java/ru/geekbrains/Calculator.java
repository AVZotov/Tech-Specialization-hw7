package ru.geekbrains;

public class Calculator {

    public <T1 extends Number, T2 extends Number> double sum(T1 value1, T2 value2){
        return (value1.doubleValue() + value2.doubleValue());
    }

    public <T1 extends Number, T2 extends Number> double multiply(T1 value1, T2 value2){
        return (value1.doubleValue() * value1.doubleValue());
    }

    public <T1 extends Number, T2 extends Number> double divide(T1 value1, T2 value2){
        if (value1.doubleValue() == 0){
            throw new ArithmeticException();
        }
        return (value1.doubleValue() / value2.doubleValue());
    }

    public <T1 extends Number, T2 extends Number> double subtract(T1 value1, T2 value2){
        return (value1.doubleValue() - value2.doubleValue());
    }
}

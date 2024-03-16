package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(4, 6.5));
        System.out.println(calculator.multiply(4, 6.5));
        System.out.println(calculator.divide(4, 6.5));
        System.out.println(calculator.subtract(4, 6.5));

        ArrayHandler arrayHandler = new ArrayHandler();

        List<Object> array1 = new ArrayList<>();
        array1.add(5);
        array1.add("5");
        array1.add('5');

        List<Object> array2 = new ArrayList<>();
        array2.add(6);
        array2.add("6");
        array2.add('6');

        System.out.println(arrayHandler.compareArrays(array1, array2));
    }

}
package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayHandler {
    public <T> boolean compareArrays(T[] array1, T[] array2){
        if (array1.length != array2.length){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i].getClass());
            System.out.println(array2[i].getClass());
            if (array1[i].getClass() != array2[i].getClass()){
                return false;
            }
        }

        return true;
    }

    public boolean compareArrays(List<Object> array1, List<Object> array2){
        if (array1.size() != array2.size()){
            return false;
        }

        for (int i = 0; i < array1.size(); i++) {
            if (!array1.get(i).getClass().equals(array2.get(i).getClass())){
                return false;
            }
        }

        return true;
    }
}

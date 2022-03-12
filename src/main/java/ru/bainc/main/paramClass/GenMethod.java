package ru.bainc.main.paramClass;

import java.util.ArrayList;

public class GenMethod {
    /** Дженерик метод, который выводит на экран 2-ой элемент ArrayList.
     *
     * @param arrayList
     * @param <T>
     * @return
     */
    public static  <T> T getSecondElement(ArrayList<T> arrayList ) {
        return arrayList.get(1);

    }
}

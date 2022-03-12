package ru.bainc.main.paramClass;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List <?> list = new ArrayList<Integer>();
        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showInfo(list1);
        List <String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("poka");
        list2.add("ok");
        showInfo(list2);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(3.14);
        arrayList.add(3.15);
        arrayList.add(3.16);
        System.out.println(summ(arrayList));

    }

    /**
     * выводит на печать элементы листа
     * @param list
     */
    static void showInfo (List<?> list) {
        System.out.println("Moy list coderjit cledyuchie elementy: " + list);
    }

    /**
     * находит сумму всех элементов ArrayList, если он Number
     * @param arrayList
     * @return summ;
     */
    public static double summ (ArrayList <? extends Number> arrayList){
        double summ = 0;
        for (Number n : arrayList){
            summ += n.doubleValue();
        }
        return summ;
    }
}

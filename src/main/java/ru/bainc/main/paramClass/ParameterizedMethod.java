package ru.bainc.main.paramClass;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add (20);
        arrayList1.add (5);
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("abc");
        arrayList2.add("def");
        arrayList2.add("ghi");
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);
        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);
    }
}

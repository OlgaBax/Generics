package ru.bainc.main.paramClass;

import ru.bainc.main.paramClass.OtherPair;
import ru.bainc.main.paramClass.Pair;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Privet", 20);
        System.out.println("Znachinie pary: value1 " + pair1.getFirstValue1() + ", value2 " + pair1.getSecondValue2());
        Pair <Integer, Double> pair2 = new Pair<>(150, 3.14);
        System.out.println("Znachinie pary: value1 " + pair2.getFirstValue1() + ", value2 " + pair2.getSecondValue2());

        OtherPair<String> otherPair1 = new OtherPair<>("Privet","Drug");
        System.out.println("Znachinie pary: value1 " + otherPair1.getFirstValue() + ", value2 " + otherPair1.getSecondValue());
    }
}

package ru.bainc.main.paramClass;

public class Pair <V1,V2> {
    private V1 value1;
    private  V2 value2;

    public Pair(V1 value1, V2 value2) { // 2 плейсхолдера нужно, если объекты разных типов.
                                         // Если одного типа ,см. OtherPair
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue1 (){
        return value1;
    }
    public V2 getSecondValue2 (){
        return value2;
    }
}

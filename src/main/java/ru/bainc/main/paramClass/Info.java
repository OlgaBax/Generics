package ru.bainc.main.paramClass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Info <T> { // параметризированный класс,
    private T value;// переменная типа Т, который в дальнейшем м.б. заменен на множество типов

    /** метод выводит на экран параметр в красивых скобках "{[]}"
     *
     * @param value
     */
    public Info (T value){
        this.value = value;
    }
@Override
    public String toString(){
        return "{[" + value + "]}";
}
public T getValue(){
        return value;
}
}

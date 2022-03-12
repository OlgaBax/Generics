package ru.bainc.main.igra;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

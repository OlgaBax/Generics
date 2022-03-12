package ru.bainc.main.igra;

import lombok.Getter;
import lombok.Setter;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Team <T extends Participant>    {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant (T     participant) {
        participantList.add(participant);
        System.out.println("V komandu "+ name + "bil dobavlen uchastni  k " + participant.getName());
    }
    public void playWith (Team <T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }
        System.out.println("Vigrala komanda " + winnerName);
    }
}

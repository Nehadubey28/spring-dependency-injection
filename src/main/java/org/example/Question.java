package org.example;

import java.util.Iterator;
import java.util.List;

public class Question {
    private int id;
    private String name;

    private List<String> answer;

    public Question(int id, String name, List<String> answer) {
        this.id = id;
        this.name = name;
        this.answer = answer;
    }

    public void displayInfo(){
        System.out.println(id+") "+name);
        System.out.println("answers are:");
        Iterator<String> Itr = answer.iterator();
        while(Itr.hasNext()){
            System.out.println(Itr.next());
        }
    }


}

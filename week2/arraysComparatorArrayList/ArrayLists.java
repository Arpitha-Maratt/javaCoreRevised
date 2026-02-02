package week2.arraysComparatorArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public void addElement(){

        ArrayList<String> names = new ArrayList<>();
        names.add("Arpitha");
        names.add("Amulya");
        names.add("Akshay");
        names.add("Sanjana");
        System.out.println(names);

    }

    public void accessElement(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arpitha");
        names.add("Amulya");
        names.add("Akshay");
        names.add("Sanjana");
        System.out.println(names.get(2));
    }

    public void iterate(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arpitha");
        names.add("Amulya");
        names.add("Akshay");
        names.add("Sanjana");
        for(String name :names){
            System.out.println(name);
        }
    }

    public void remove(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arpitha");
        names.add("Amulya");
        names.add("Akshay");
        names.add("Sanjana");

        System.out.println(names.remove(2));
    }

    public void sorting(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arpitha");
        names.add("Amulya");
        names.add("Akshay");
        names.add("Sanjana");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("Contains Abhi?"+ names.contains("Abhi"));
    }
}

package week2.arraysComparatorArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AllClassMain {
    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        arrays.arrayBasic();

        SumOfElement sumOfElement = new SumOfElement();
        sumOfElement.sumOfElement();

        MultiDim multiDim = new MultiDim();
        multiDim.array();

        ArrayLists arrayLists = new ArrayLists();
        System.out.println("All elements");
        arrayLists.addElement();
        System.out.println("Accessed elements");
        arrayLists.accessElement();
        arrayLists.iterate();
        System.out.println("iterated element");
        arrayLists.sorting();

        ArrayList<Student> students =  new ArrayList<>();
        students.add(new Student("Arpitha",21));
        students.add(new Student("XYZ",22));

        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students,(s1,s2)-> s1.name.compareTo(s2.name));
        System.out.println(students);

StudentChaining student = new StudentChaining();
student.display();

BasicClass deafultConstructor = new BasicClass();
deafultConstructor.display();

BasicClass parameterized = new BasicClass("Arpitha",21);
parameterized.display();

BasicClass constructorOverload = new BasicClass("Arpitha");
constructorOverload.display();



    }
}

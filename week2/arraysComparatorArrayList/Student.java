package week2.arraysComparatorArrayList;

public class Student  implements  Comparable<Student>{
    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student student){
        return this.age - student.age;
    }

    public String toString(){
        return name + " - "+age;
    }
}

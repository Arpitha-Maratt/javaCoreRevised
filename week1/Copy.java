package week1;

public class Copy {
    String name;
    int age;

    Copy(String name,int age){
        this.name=name;
        this.age=age;
    }

    Copy(Copy copy){
        this.name=copy.name;
        this.age=copy.age;
    }
}



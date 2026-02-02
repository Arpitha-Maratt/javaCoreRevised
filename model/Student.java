package model;

public class Student {

    private int id;
    private String name;
    private String course;
    private String subject;
    private String email;

    public Student(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id){
        this.id=id;
    }
}

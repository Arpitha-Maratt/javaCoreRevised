package week2.arraysComparatorArrayList;

public class ComparatorStudent {
    String name;
    int age;

    public ComparatorStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComparatorStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

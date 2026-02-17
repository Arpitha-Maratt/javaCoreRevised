package practice;

class Employee {
    static int count = 0;   // shared
    int id;                 // instance-specific

    Employee(int id) {
        this.id = id;
        count++;
    }
}

public class Tests {
    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102);

        assert Employee.count == 2;
    }
}

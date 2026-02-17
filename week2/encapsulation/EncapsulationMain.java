package week2.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(101);
        System.out.println( student.getId());

        Employee employee = new Employee();
        employee.setSalary(45000.99);
        System.out.println(employee.getSalary());

        User user= new User();
        user.setUserName("Arpitha");
        System.out.println(user.getUserName());

        Printer printer = new Printer();
        printer.turnOff();
        printer.turnOn();
    }
}

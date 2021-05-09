package Behavioural.Memento;

import java.text.MessageFormat;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();

        emp.setName("Ashwin Hariharan");
        emp.setAddress("Bengaluru");
        emp.setPhone("6786736");

        System.out.println(MessageFormat.format("Employee before save :  {0}", emp));
        caretaker.save(emp);

        emp.setPhone("36362578");
        caretaker.save(emp);
        System.out.println(MessageFormat.format("Employee after change and save :  {0}", emp));

        emp.setPhone("7577675"); // Save not called
        caretaker.revert(emp);
        System.out.println(MessageFormat.format("Reverts to last save point :  {0}", emp));

        caretaker.revert(emp);
        System.out.println(MessageFormat.format("Reverted to original :  {0}", emp));
    }
}

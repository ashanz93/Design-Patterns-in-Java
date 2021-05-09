package Behavioural.Memento;

import lombok.Data;

import java.text.MessageFormat;

public @Data class Employee {
    private String name;
    private String phone;
    private String address;

    public String toString() {
        return MessageFormat.format("{0} : {1}", name, phone);
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento emp) {
        this.name = emp.getName();
        this.phone = emp.getPhone();
    }
}

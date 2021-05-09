package Behavioural.Memento;

import lombok.Getter;

public class EmployeeMemento {
    private @Getter String name;
    private @Getter String phone;
    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

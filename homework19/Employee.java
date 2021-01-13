package javacore.homework19;

import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private transient int salary;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        Methods.serialize(employee);
        Methods.deserialize();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

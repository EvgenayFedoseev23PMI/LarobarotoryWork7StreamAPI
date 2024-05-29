package com.company;

import javax.lang.model.element.Name;
import java.util.List;

public class Client {
    private int id;
    private String Name;
    private int age;
    private String gender;
    private List<Phone> phones;

    public Client(int id, String Name, int age, String gender, List<Phone> phones) {
        this.id=id;
        this.Name=Name;
        this.age=age;
        this.gender=gender;
        this.phones=phones;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<Phone> getPhones() {
        return phones;
    }
}

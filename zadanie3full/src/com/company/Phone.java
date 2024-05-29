package com.company;

public class Phone {
    private String value;
    private String type;

    public Phone(String value,String type) {
        this.value = value;
        this.type=type;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}

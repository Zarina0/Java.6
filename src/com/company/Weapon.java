package com.company;

public class Weapon {
    private String typOf;
    private String name;

    public Weapon(String typOf, String name) {
        this.typOf = typOf;
        this.name = name;
    }

    public String getTypOf() {
        return typOf;
    }

    public void setTypOf(String typOf) {
        this.typOf = typOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

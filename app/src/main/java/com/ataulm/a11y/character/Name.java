package com.ataulm.a11y.character;

public class Name {

    private final String name;

    public Name(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

package com.ataulm.a11y.character;

public class Age {

    private static final Age UNKNOWN = new Age();

    private final int age;

    // TODO: should construct from birth date but ssh.
    public Age(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Use a positive age, or Age.unknown if unknown.");
        }
        this.age = age;
    }

    Age() {
        this.age = -1;
    }

    public static Age unknown() {
        return UNKNOWN;
    }

}

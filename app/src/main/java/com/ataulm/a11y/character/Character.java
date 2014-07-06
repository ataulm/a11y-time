package com.ataulm.a11y.character;

public class Character {

    private final Name name;
    private final Gender gender;
    private final Age age;
    private final Species species;
    private final Roles roles;
    private final int profileDrawableResId;

    public Character(Name name, Gender gender, Age age, Species species, Roles roles, int profileDrawableResId) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.species = species;
        this.roles = roles;
        this.profileDrawableResId = profileDrawableResId;
    }

    public String getName() {
        return name.toString();
    }

    public int getProfileDrawableResId() {
        return profileDrawableResId;
    }

}

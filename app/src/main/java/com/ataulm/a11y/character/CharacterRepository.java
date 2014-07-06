package com.ataulm.a11y.character;

import com.ataulm.a11y.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharacterRepository {

    private static final Character[] ALL = {finn(), jake(), marceline(), iceKing(), bubblegum(), lsp(), rainicorn(), bmo(), fionna(), lichKing()};
    private static final List<Character> ALL_CHARACTERS = new ArrayList<Character>(ALL.length);

    static {
        Collections.addAll(ALL_CHARACTERS, ALL);
    }

    public static List<Character> fetchAll() {
        return ALL_CHARACTERS;
    }

    private static Character finn() {
        return new Character(
                new Name("Finn"),
                Gender.MALE,
                new Age(15),
                Species.HUMAN,
                new Roles("Hero", "Adventurer", "King", "Wizard", "Marceline's Henchman"),
                R.drawable.profile_finn);
    }

    private static Character jake() {
        return new Character(
                new Name("Jake"),
                Gender.MALE,
                new Age(28),
                Species.DOG,
                new Roles("Criminal, Hero, Adventurer, Clown, Queen, Father"),
                R.drawable.profile_jake);
    }

    private static Character marceline() {
        return new Character(
                new Name("Marceline Abadeer"),
                Gender.FEMALE,
                new Age(1004),
                Species.VAMPIRE_DEMON,
                new Roles("Vampire Queen"),
                R.drawable.profile_marceline);
    }

    private static Character iceKing() {
        return new Character(
                new Name("Ice King"),
                Gender.MALE,
                new Age(1044),
                Species.WIZARD,
                new Roles("King of the Ice Kingdom"),
                R.drawable.profile_iceking);
    }

    private static Character bubblegum() {
        return new Character(
                new Name("Princess Bonnibel Bubblegum"),
                Gender.FEMALE,
                new Age(827),
                Species.CANDY_PERSON,
                new Roles("Princess of the Candy Kingdom", "Scientist"),
                R.drawable.profile_pb);
    }

    private static Character rainicorn() {
        return new Character(
                new Name("Lady Rainicorn"),
                Gender.FEMALE,
                Age.unknown(),
                Species.RAINICORN,
                new Roles("Princess Bubblegum's Royal Pet and Transport", "Mother"),
                R.drawable.profile_rainicorn);
    }

    private static Character lsp() {
        return new Character(
                new Name("Lumpy Space Princess"),
                Gender.FEMALE,
                new Age(15),
                Species.LUMPY_SPACE_PERSON,
                new Roles("Princess"),
                R.drawable.profile_lsp);
    }

    private static Character bmo() {
        return new Character(
                new Name("BMO"),
                Gender.NONE,
                Age.unknown(),
                Species.MO,
                new Roles("Video game system"),
                R.drawable.profile_bmo);
    }

    private static Character fionna() {
        return new Character(
                new Name("Fionna"),
                Gender.FEMALE,
                new Age(14),
                Species.HUMAN,
                new Roles("Heroine", "Adventurer"),
                R.drawable.profile_fionna);
    }

    private static Character lichKing() {
        return new Character(
                new Name("The Lich"),
                Gender.MALE,
                Age.unknown(),
                Species.LICH,
                new Roles("Villain"),
                R.drawable.profile_lich);
    }

}

package com.KudryashevDaniil.person;

import java.util.Optional;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    public boolean marry(Person person) {
        if (spouse == person)
            return false;
        if (person.man != man) {
            if (person.spouse != null) {
                person.divorce();
            }
            if (spouse != null) {
                divorce();
            }
            setSpouse(person);
            person.setSpouse(this);
            return true;
        }
        return false;
    }

    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if (spouse == null)
            return false;
        spouse.setSpouse(null);
        setSpouse(null);
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "man=" + man +
                ", name='" + name + '\'' +
                ", spouse=" + (spouse != null ? spouse.name : "No spose") +
                '}';
    }
}
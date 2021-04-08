package com.KudryashevDaniil;

import com.KudryashevDaniil.person.Person;

public class Main {
    public static void main(String[] args) {
        Person ilya = new Person(true, "Ilya");
        Person anya = new Person(false, "Anya");
        Person igor = new Person(true, "Igor");
        System.out.println(ilya.divorce());
        System.out.println(ilya.marry(igor));
        System.out.println(ilya.marry(anya));
        System.out.println(ilya.marry(igor));
        System.out.println(anya.marry(igor));

        System.out.println(ilya);
        System.out.println(anya);
        System.out.println(igor);
    }
}

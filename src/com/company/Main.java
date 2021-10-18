package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sport fusball= new Fussball();
        Sport fusball2= new Fussball();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
	    Benutzer benutzer= new Benutzer("Ioana","Pop",Arrays.asList(basketball,hindernislauf));
        Benutzer benutzer1 = new Benutzer("Andrei", "Mihai",Arrays.asList(fusball,fusball2));
        System.out.println(benutzer.kalkuliere_durchschnitt());
        System.out.println(benutzer1.kalkuliere_zeit());
        System.out.println(benutzer1.kalkuliere_zeit(fusball));
    }
}

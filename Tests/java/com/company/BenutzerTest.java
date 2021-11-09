package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @org.junit.jupiter.api.Test

    /**
     * Test fur die kalkuliere Zeit Methode
     */
    void kalkuliere_zeit() {
        Sport fusball= new Fussball();
        Sport hochsprung= new Hochsprung();
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Benutzer benutzer= new Benutzer("Ioana","Pop", Arrays.asList(basketball,hindernislauf,fusball,hochsprung));
        assertEquals(benutzer.kalkuliere_zeit(),benutzer.kalkuliere_zeit(basketball)+benutzer.kalkuliere_zeit(hindernislauf)+benutzer.kalkuliere_zeit(fusball)+benutzer.kalkuliere_zeit(hochsprung));

    }

    @org.junit.jupiter.api.Test   //
    void testKalkuliere_zeit() {
        Sport basketball = new Basketball();
        Sport hindernislauf = new Hindernislauf();
        Benutzer benutzer= new Benutzer("Ioana","Pop", Arrays.asList(basketball,hindernislauf));
        assertEquals(benutzer.kalkuliere_zeit(basketball),55);
        assertEquals(benutzer.kalkuliere_zeit(hindernislauf),30);
    }

    @org.junit.jupiter.api.Test  //Test fur die Durchschnittmethode
    void kalkuliere_durchschnitt() {
        Sport basketball = new Basketball();
        Sport hochsprung= new Hochsprung();
        Benutzer benutzer= new Benutzer("Ioana","Pop", Arrays.asList(basketball,hochsprung));
        assertEquals(benutzer.kalkuliere_durchschnitt(),25);
    }
}
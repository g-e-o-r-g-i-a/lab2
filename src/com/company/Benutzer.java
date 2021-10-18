package com.company;

import java.util.List;


public class Benutzer {
    private String vorname;  //Attribute
    private String nachname;
    private List<Sport> sport;

    public Benutzer(String vorname, String nachname, List<Sport> sport) {  //Konstruktor
        this.vorname = vorname;
        this.nachname = nachname;
        this.sport = sport;
    }

    public double kalkuliere_zeit(){  //ich kalukuliere wie viel Zeit fur jeder Sport aus meiner Liste gebraucht wird
        double zeit = 0;
        for (Sport sport : sport){
            zeit += sport.kalkuliere_zeit();
        }
        return zeit;
    }

    public double kalkuliere_zeit(Sport sport) {  //ich kalkuliere die Zeit fur einen gegebenen Sport
        return sport.kalkuliere_zeit();
    }

    public double kalkuliere_durchschnitt() {  //ich kalkuliere die Durschscnittzeit fur die Elemente aus meiner Liste
        double zeit = 0;
        for (Sport sport : sport){
            zeit += sport.kalkuliere_zeit();
        }
            return zeit/sport.size();
    }

    public String getVorname() {  //getters
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setVorname(String vorname) {  //setters
        this.vorname=vorname;
    }

    public void setNachname(String nachname) {
        this.nachname=nachname;
    }

    public void setSport(List<Sport> sport) {
        this.sport=sport;
    }
}


package com.company;

import java.util.List;


public class Benutzer {
    private String vorname;  //Attribute
    private String nachname;
    private List<Sport> sport;

    /**
     * constructor
     * @param vorname
     * @param nachname
     * @param sport
     */
    public Benutzer(String vorname, String nachname, List<Sport> sport) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.sport = sport;
    }

    /**
     * ich kalukuliere wie viel Zeit fur jeder Sport aus meiner Liste gebraucht wird
     * @return die  kalkulierte Zeit
     */
    public double kalkuliere_zeit(){
        double zeit = 0;
        for (Sport sport : sport){
            zeit += sport.kalkuliere_zeit();
        }
        return zeit;
    }

    /**
     *  ich kalkuliere die Zeit fur einen gegebenen Sport
     * @param sport
     * @return die  kalkulierte Zeit
     */
    public double kalkuliere_zeit(Sport sport) {
        return sport.kalkuliere_zeit();
    }


    /**
     * ich kalkuliere die Durschscnittzeit fur die Elemente aus meiner Liste
     * @return die kalkulierte Durschschnitt
     */
    public double kalkuliere_durchschnitt() {
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


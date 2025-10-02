package io.datajek.springmvc.tennis_player_web.formtags;

import org.springframework.stereotype.Component;

@Component
public class Athlete {
    private String lastName;
    private String country;
    private String[] grandSlams;
    private String handedness;


    public Athlete(){}

    public String getLastName() {return lastName;}
    public String getCountry() {return country;}
    public String[] getGrandSlams() {return grandSlams;}
    public  String getHandedness() {return handedness;}

    public void setHandedness(String handedness) {this.handedness = handedness;}
    public void setGrandSlams(String[] grandSlams) {this.grandSlams = grandSlams;}
    public void setCountry(String country) {this.country = country;}
    public void  setLastName(String lastName) {this.lastName = lastName;}
}

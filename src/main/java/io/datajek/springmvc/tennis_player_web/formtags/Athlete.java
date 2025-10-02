package io.datajek.springmvc.tennis_player_web.formtags;

import org.springframework.stereotype.Component;

@Component
public class Athlete {
    private String lastName;

    public Athlete(){}

    public String getLastName() {return lastName;}
    public void  setLastName(String lastName) {this.lastName = lastName;}
}

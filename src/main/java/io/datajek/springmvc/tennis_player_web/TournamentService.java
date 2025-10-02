package io.datajek.springmvc.tennis_player_web;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TournamentService {
    private List<Tournament> tournaments = Arrays.asList(
            new Tournament(1, "PSL", "Dubai", 20),
            new Tournament(2, "IPL", "India", 10),
            new Tournament(3, "ABL", "Egypt", 20)
    );

    public Tournament getTournamentByLocation(String  location){
        return tournaments.stream().filter(t -> t.getLocation().equals(location)).findFirst().orElse(null);
    }
}

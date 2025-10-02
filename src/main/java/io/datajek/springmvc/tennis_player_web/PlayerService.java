package io.datajek.springmvc.tennis_player_web;

import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Component
public class PlayerService {
    private List<Player> players = Arrays.asList(
            new Player(1, "Bilal", "Serbia", Date.valueOf("1987-05-22"), 98),
            new Player(2, "Hamza", "France", Date.valueOf("1986-07-01"), 12),
            new Player(3, "Sufyan", "USA", Date.valueOf("1985-04-26"), 16)
    );

    public Player getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }
}

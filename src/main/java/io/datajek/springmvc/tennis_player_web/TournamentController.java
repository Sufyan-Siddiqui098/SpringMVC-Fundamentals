package io.datajek.springmvc.tennis_player_web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @RequestMapping(value = "/tournament")
    public String showTournamentForm(){
        return "tournament-form";
    }

    @RequestMapping(value = "/processTournamentForm")
    public String processTournamentForm(HttpServletRequest request, Model model){
        String location = request.getParameter("location");
        Tournament tournament = tournamentService.getTournamentByLocation(location);
        model.addAttribute("name", tournament.getName());
        model.addAttribute("location", tournament.getLocation());
        model.addAttribute("teams_count", tournament.getTeamsCount());
        return "tournament-detail";

    }
}

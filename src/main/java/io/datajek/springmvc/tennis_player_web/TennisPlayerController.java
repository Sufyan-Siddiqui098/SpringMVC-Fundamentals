package io.datajek.springmvc.tennis_player_web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TennisPlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/")
    public String welcome(){
        return "main-menu";
    }

    @RequestMapping(value = "/showPlayerForm")
    public String showForm(){
        return "search-player-form";
    }

    @RequestMapping(value = "/processPlayerForm")
    public String processPlayerForm(HttpServletRequest request, Model model){
        String pName= request.getParameter("playerName");
        Player player = playerService.getPlayerByName(pName);
        model.addAttribute("name", pName);
        model.addAttribute("name", pName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        return "player-detail";
    }
}

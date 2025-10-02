package io.datajek.springmvc.tennis_player_web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    // default in the request parameter is to handle the null submission.
    public String processPlayerForm(@RequestParam(value ="playerName", defaultValue = "Bilal") String pName, Model model){
        Player player = playerService.getPlayerByName(pName);
        String theName = pName.toUpperCase();
        model.addAttribute("name", theName);
        model.addAttribute("name", pName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());
        return "player-detail";
    }
}

package io.datajek.springmvc.tennis_player_web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TennisPlayerController {

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
        model.addAttribute("name", pName);
        return "player-detail";
    }
}

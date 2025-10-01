package io.datajek.springmvc.tennis_player_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TennisPlayerController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String welcome(){
        return "Welcome to the Tennis Player database from Spring MVC!";
    }
}

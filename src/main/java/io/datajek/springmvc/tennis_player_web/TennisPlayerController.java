package io.datajek.springmvc.tennis_player_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TennisPlayerController {

    @RequestMapping(value = "/")
    public String welcome(){
        return "main-menu";
    }
}

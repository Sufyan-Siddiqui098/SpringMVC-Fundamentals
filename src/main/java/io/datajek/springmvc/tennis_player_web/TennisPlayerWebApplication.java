package io.datajek.springmvc.tennis_player_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TennisPlayerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerWebApplication.class, args);
	}

}

package com.wozu.pokemonDeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class Controller {

    @GetMapping("/welcome")
    public String getWelcome(){
        return "Welcome Trainer!";
    }

}

package com.vinaylogics.joke.controllers;

import com.vinaylogics.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJokes());
        return "chucknorris";
    }
}

package com.vinaylogics.joke.services.impl;

import com.vinaylogics.joke.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

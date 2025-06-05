package com.develhope.esercizi.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller // si usa per i controller che hanno un template HTML (cioè una view)

public class MovieController {
    private Map<Integer, String> movies = Map.of(
            1, "The matrix",
            2, "The godfather",
            3, "abacbabcac",
            4, "etc....",
            5, "asdasdasdasd"
    );

//    @GetMapping("/movie")
//    public String movie() {
//        Collection<String> nomiFilm = movies.values();
//        StringBuilder nomiConcatenati = new StringBuilder();
//
//        for (String nome : nomiFilm) {
//            nomiConcatenati.append(nome + " | ");
//        }
//        return nomiConcatenati.toString();
//    }
//
//    @GetMapping("/movie/{id}")
//    public String movieById(@PathVariable("id") Integer id) {
//        return movies.get(id) + "";
//    }

    @GetMapping(value= {"/movie", "/movie/{id}"})
    public String movieById(@PathVariable(value="id", required=false) Integer id) {
        if (id == null) {
            Collection<String> nomiFilm = movies.values();
            StringBuilder nomiConcatenati = new StringBuilder();

            for (String nome : nomiFilm) {
                nomiConcatenati.append(nome + " | ");
            }
            return nomiConcatenati.toString();
        } else {
            return movies.get(id) + "";
        }
    }

}
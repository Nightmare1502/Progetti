package com.develhope.biblioteca.controller;

import org.springframework.web.bind.annotation.*;

@RestController
// @RequestMapping("/hello")
public class LibroController {

    @GetMapping
    public String helloWorld(@RequestParam (required = false) String nome) {
        if (nome != null){
            return "Hello world!" + nome.toUpperCase();
        } else {
            return "Hello world!";
        }
    }

    @GetMapping("/hello")
    public String helloWorld2(@RequestParam (required = false, defaultValue = "utente", name = "name") String nome,
                              @RequestParam (required = false) Integer numero) {

        if (numero != null) {
            StringBuilder saluti = new StringBuilder();
            for (int i = 0; i < numero; i++) {
                saluti.append("Hello " + nome.toUpperCase() + "!");
            }
            return saluti.toString();
        } else {
            return "Errore";
        }
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") Integer userId) {
        return "Dati dell'utente: " + userId;
    }
}

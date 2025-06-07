package com.develhope.esercizi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EsercizioController {

    @GetMapping("/ciao")
    public String hello(@RequestParam(required = true) String nome,
                        @RequestParam(required = true) String regione) {
        return "Ciao " + nome + ", com'è il tempo in " + regione + "?";

    }
}

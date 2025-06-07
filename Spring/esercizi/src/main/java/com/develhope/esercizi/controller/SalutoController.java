package com.develhope.esercizi.controller;


import com.develhope.esercizi.model.Saluto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/ciao")
public class SalutoController {

    @GetMapping("/{provincia}")
    public Saluto saluta(@PathVariable String provincia, @RequestParam String nome) {
        return new Saluto(nome, provincia);
    }
}

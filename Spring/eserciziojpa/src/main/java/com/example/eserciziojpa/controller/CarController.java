package com.example.eserciziojpa.controller;

import com.example.eserciziojpa.model.Macchina;
import com.example.eserciziojpa.repository.MacchinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v3")
public class MacchinaController {

    @Autowired
    private MacchinaRepository macchinaRepo;

    @GetMapping("/ciao")
    public List<Macchina> listaMacchine() {
        return macchinaRepo.findAll();
    }

}

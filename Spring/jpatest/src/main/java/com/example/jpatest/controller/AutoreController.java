package com.example.jpatest.controller;

import com.example.jpatest.model.Autore;
import com.example.jpatest.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    @Autowired
    private AutoreRepository autoreRepo;

    @GetMapping("/{id}")
    public Autore getAutore(@PathVariable("id") Integer id) {
        Optional<Autore> op = autoreRepo.findById(id);

        if (op.isEmpty())
            throw new ResponseStatusException(HttpStatus.valueOf(404), "Autore non trovato");

        return op.get();
    }

    @GetMapping
    public List<Autore> getAutori() {
//        Iterable<Autore> autori = autoreRepo.findAll();
//        List<Autore> autoriList = new ArrayList<>();
//
//        for (Autore a : autori) {
//            autoriList.add(a);
//        }
        return autoreRepo.findAll(); // Questo funziona perché JpaRepository estende CrudRepository che ha il metodo findAll() che ritorna un Iterable
    }

    @PostMapping
    public Autore createAutore(@RequestBody Autore autore) {
        return autoreRepo.save(autore);
    }

}

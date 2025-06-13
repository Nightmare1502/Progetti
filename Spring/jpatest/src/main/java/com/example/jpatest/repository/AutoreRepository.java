package com.example.jpatest.repository;

import com.example.jpatest.model.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


// JpaRepository ha le funzionalità di CrudRepository e in più ha le funzionalità per la paginazione e l'ordinamento
public interface AutoreRepository extends JpaRepository<Autore, Integer> {

}

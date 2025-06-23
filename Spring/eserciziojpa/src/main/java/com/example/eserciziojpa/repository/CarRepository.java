package com.example.eserciziojpa.repository;

import com.example.eserciziojpa.model.Macchina;
import org.springframework.data.jpa.repository.JpaRepository;

/* JpaRepository ha le funzionalità di CrudRepository e in più ha le funzionalità
   per la paginazione e l'ordinamento
 */
public interface MacchinaRepository extends JpaRepository<Macchina, Integer> {
}

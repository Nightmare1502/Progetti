package com.example.eserciziojpa.repository;

import com.example.eserciziojpa.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

/* JpaRepository ha le funzionalità di CrudRepository e in più ha le funzionalità
   per la paginazione e l'ordinamento
 */
public interface CarRepository extends JpaRepository<Car, Integer> {

    Page<Car> findByModelNameContains(String modelName, Pageable pg);

    @NativeQuery(value = "SELECT * FROM macchina WHERE type LIKE ?")
    Page<Car> findByTypeContains(String type, Pageable pg);

}

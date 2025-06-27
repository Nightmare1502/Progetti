package com.example.eserciziojpa.controller;

import com.example.eserciziojpa.dto.APIResponse;
import com.example.eserciziojpa.enums.CarType;
import com.example.eserciziojpa.model.Car;
import com.example.eserciziojpa.repository.CarRepository;
import com.example.eserciziojpa.utils.PaginationUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepo;

    @GetMapping
    public Page<Car> listaMacchine(@RequestParam(required = false, defaultValue = "0") Integer pageNumber,
                                   @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        Pageable pg = PaginationUtils.createPage(pageNumber, pageSize);
        return carRepo.findAll(pg);
    }

    @GetMapping("/searchtype")
    public ResponseEntity<APIResponse> searchByType(@RequestParam String type,
                                                    @RequestParam(required = false, defaultValue = "0") Integer pageNumber,
                                                    @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                                    @RequestParam(required = false, defaultValue = "ASC") String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase("DESC") ? Sort.by("type").descending()
                : Sort.by("type").ascending();

        Pageable pg = PageRequest.of(pageNumber, pageSize, sort);
        Page<Car> car = carRepo.findByTypeContains("%" + type + "%", pg);

        return ResponseEntity.ok(new APIResponse(car));
    }


    @GetMapping("/{id}")
    public ResponseEntity<APIResponse> findById(@PathVariable("id") Integer id) {
        Optional<Car> c = carRepo.findById(id);
        if (c.isPresent()) {
            APIResponse apiResponse = new APIResponse(c.get());
            return ResponseEntity.ok(apiResponse);
        }
        String message = "Autore non trovato ! ";
        APIResponse apiResponse2 = new APIResponse(message);

        return ResponseEntity.status(404).body(apiResponse2);
    }

    @PostMapping
    public ResponseEntity<APIResponse> createCar(@Valid @RequestBody Car car, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            APIResponse apiResponse = new APIResponse(bindingResult.getAllErrors());
            return ResponseEntity.badRequest().body(apiResponse);
        }
        APIResponse apiResponse = new APIResponse(carRepo.save(car));
        return ResponseEntity.ok(apiResponse);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllCars() {
        carRepo.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Integer id) {
        if (!carRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        carRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/type")
    public ResponseEntity<Car> updateCarType(@PathVariable Integer id, @RequestBody CarType type) {
        if (!carRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        Optional<Car> carOpt = carRepo.findById(id);
        if (carOpt.isPresent()) {
            Car car = carOpt.get();
            car.setType(type);
            return ResponseEntity.ok(carRepo.save(car));
        }
        return ResponseEntity.notFound().build();
    }

}

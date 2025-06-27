package com.example.eserciziojpa.model;

import com.example.eserciziojpa.enums.CarColor;
import com.example.eserciziojpa.enums.CarType;
import jakarta.persistence.*;

/**
 * Classe che rappresenta una macchina.
 * Mappa la tabella "macchina" nel database.
 */

@Entity
@Table(name = "macchina")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CarType type;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CarColor color;

    @Column
    private String description;

    private Car() {}

    public Car(String modelName, CarType type, CarColor color, String description) {
        this.modelName = modelName;
        this.type = type;
        this.color = color;
        this.description = description;
    }

    public Car(String modelName, CarType type, CarColor color) {
        this(modelName, type, color, null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

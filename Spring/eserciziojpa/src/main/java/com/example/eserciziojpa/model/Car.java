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
public class Macchina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private CarType type;

    @Column(nullable = false)
    private CarColor color;

    @Column
    private String description;

    public Macchina() {}

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

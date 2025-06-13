package com.example.eserciziojpa.model;

import jakarta.persistence.*;

/**
 * Classe che rappresenta una macchina.
 * Mappa la tabella "macchine" nel database.
 */

@Entity
@Table(name = "macchina")
public class Macchina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "modello", nullable = false, length = 50)
    private String modello;

    @Column(name = "anno", nullable = false, length = 4)
    private Integer anno;

    @Column(name = "cilindrata", nullable = false, length = 10)
    private String cilindrata;

    public Macchina() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }
}

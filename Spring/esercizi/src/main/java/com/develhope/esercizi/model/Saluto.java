package com.develhope.esercizi.model;

public class Saluto {

    private String nome;
    private String provincia;
    private String messaggio;

    public Saluto(String nome, String provincia){
        this.nome = nome;
        this.provincia = provincia;
        this.messaggio = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
}

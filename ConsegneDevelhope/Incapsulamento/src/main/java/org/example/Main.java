package org.example;
// creiamo la classe Auto e assegniamo
// le variabili private
class Auto{

    private String marca;
    private String modello;
    private int cilindrata;
    private String targa;
    // generiamo il costruttore
    public Auto (String marca, String modello, int cilindrata, String targa){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;

    }
    // generiamo i metodi accessori getter e setter
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

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa){
        this.targa = targa;
    }
    // creiamo un metodo per la stampa
    public void stampaAuto(){
        System.out.println("Dettagli auto:");
        System.out.println("Marca - " + marca);
        System.out.println("Modello - " + modello);
        System.out.println("Cilindrata - " + cilindrata + "cc");
        System.out.println("Targa - " + targa);
    }
}

public class Main {
    public static void main(String[] args) {
// creiamo l'istanza di classe
        Auto auto1 = new Auto("BMW", "M5", 4395, "AB123CD");
        auto1.stampaAuto();

    }
}
package org.example;
// creiamo la classe Studente e assegniamo
// le variabili private
class Studente{

   private String nome;
   private String cognome;
   private int identificativo;
// generiamo il costruttore
   public Studente (String nome, String cognome, int identificativo){
       this.nome = nome;
       this.cognome = cognome;
       this.identificativo = identificativo;
   }
// generiamo i metodi accessori getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }
// creiamo un metodo per la stampa
    public void stampaStudente(){
       System.out.println("Studente: " + nome + " " + cognome + " ID: " + identificativo);
    }
}

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Mario", "Rossi", 21);
        studente1.stampaStudente();

    }
}
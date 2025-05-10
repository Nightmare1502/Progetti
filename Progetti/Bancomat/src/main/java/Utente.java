class Utente {
    private String nome;
    private String cognome;
    private int saldo;
    private int pin;

    // Costruttore per inizializzare i dati dell'utente
    public Utente(String nome, String cognome, int saldo, int pin) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = saldo;
        this.pin = pin;
    }

    // Getter per nome
    public String getNome() {
        return nome;
    }

    // Getter per cognome
    public String getCognome() {
        return cognome;
    }

    // Getter per saldo
    public int getSaldo() {
        return saldo;
    }

    // Getter per pin
    public int getPin() {
        return pin;
    }

    // Setter per saldo (permette di aggiornare il saldo in modo controllato)
    public void setSaldo(int nuovoSaldo) {
        this.saldo = nuovoSaldo;
    }

    // Metodo per visualizzare i dati dell'utente
    public void mostraDati() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Saldo: " + saldo);
    }
}
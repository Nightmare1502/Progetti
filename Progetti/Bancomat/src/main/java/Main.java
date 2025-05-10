import java.util.Scanner;

// Creare una classe ATMExample per implementare la funzionalità di un bancomat
    // Metodo main che avvia il programma
public class Main {
    public static void main(String[] args) {
        // Creare utenti multipli
        Utente utente1 = new Utente("Mario", "Rossi", 2500, 1234);
        Utente utente2 = new Utente("Luca", "Bianchi", 5000, 5678);
        Utente utente3 = new Utente("Anna", "Verdi", 10000, 9876);
        Utente[] utenti = {utente1, utente2, utente3};

        // Creare un oggetto della classe Scanner per ottenere l'input dell'utente
        Scanner sc = new Scanner(System.in);

        // Verifica del PIN prima di entrare nel menu
        System.out.print("Inserisci il tuo PIN: ");
        int pinInserito = sc.nextInt();
        Utente utenteCorrente = null;

        // Controllo per trovare l'utente corrispondente al PIN
        for (Utente utente : utenti) {
            if (utente.getPin() == pinInserito) {
                utenteCorrente = utente;
                break;
            }
        }

        // Se nessun utente corrisponde al PIN, termina il programma
        if (utenteCorrente == null) {
            System.err.println("PIN non valido. Accesso negato.");
            return;
        }

        // Accesso consentito, avvia il menu
        System.out.println("Accesso consentito. Benvenuto " + utenteCorrente.getNome() + " " + utenteCorrente.getCognome() + "!" + "\n");
        utenteCorrente.mostraDati();

        // Ciclo infinito per mostrare continuamente il menu finché l'utente non esce
        while(true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Scegli 1 per Prelievo");
            System.out.println("Scegli 2 per Deposito");
            System.out.println("Scegli 3 per Verifica Saldo");
            System.out.println("Scegli 0 per USCITA");
            System.out.print("Scegli l'operazione che vuoi eseguire:");

            // Ottenere la scelta dell'utente
            int choice = sc.nextInt();

            // Controllo se l'utente ha inserito un numero non valido (diverso da 0, 1, 2, 3, 4)
            if (choice < 0 || choice > 4) {
                System.err.println("Errore: scelta non valida. Per favore inserisci un numero tra 0 e 4.");
                continue;  // Continua a chiedere un'opzione valida senza uscire dal ciclo
            }

            switch(choice) {
                case 1:
                    System.out.print("Inserisci l'importo da prelevare:");

                    // Ottenere l'importo del prelievo dall'utente
                    int withdraw = sc.nextInt();

                    // Verificare se il saldo è sufficiente per il prelievo richiesto
                    if(utenteCorrente.getSaldo() >= withdraw) {
                        // Aggiornare il saldo
                        utenteCorrente.setSaldo(utenteCorrente.getSaldo() - withdraw);
                        System.out.println("Si prega di ritirare il denaro");
                    } else {
                        // Mostrare un messaggio di errore personalizzato
                        System.err.println("Saldo insufficiente");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Inserisci l'importo da depositare:");

                    // Ottenere l'importo del deposito dall'utente
                    int deposit = sc.nextInt();

                    // Aggiornare il saldo
                    utenteCorrente.setSaldo(utenteCorrente.getSaldo() + deposit);
                    System.out.println("Il tuo denaro è stato depositato con successo");
                    System.out.println("");
                    break;

                case 3:
                    // Visualizzare il saldo totale dell'utente
                    System.out.println("Saldo: " + utenteCorrente.getSaldo());
                    System.out.println("");
                    break;

                case 0:
                    // Uscire dal programma
                    System.out.println("Grazie per aver usato il nostro servizio. Arrivederci!");
                    System.exit(0);
            }
        }
    }
}
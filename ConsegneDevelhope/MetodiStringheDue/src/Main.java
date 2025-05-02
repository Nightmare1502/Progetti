public class Main {
    public static void main(String[] args) {

        OttieniUnicode unicode1 = new OttieniUnicode("parola", 5);
        System.out.println(unicode1.ritornaUnicode());
        OttieniUnicode unicode2 = new OttieniUnicode("", 0);
        System.out.println(unicode2.ritornaUnicode());
    }

}

class OttieniUnicode{

    private String stringa;
    private int indice;
    public OttieniUnicode(String s, int i){
        stringa = s;
        indice = i;
    }

    public String ritornaUnicode(){

        StringBuilder risultato = new StringBuilder();
        if( stringa == null) {
            risultato.append("Errore stringa vuota!");


        }
        else if(indice < 0 || indice >= stringa.length()) {
            risultato.append("Errore l'indice selezionato non corrisponde ad un carattere della stringa!");
        }
        else{
            char c = stringa.charAt(indice);
            risultato.append("L'unicode del carattere '").append(c).append("' è ").append((int) c);
        }

        return risultato.toString();
    }
}
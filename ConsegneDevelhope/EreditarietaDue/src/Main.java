class Forma {

    public void calcolaArea() {

        System.out.println("L'area della forma selezionata è: ");

    }
}

class Rettangolo extends Forma {

    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza){
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        super.calcolaArea();
        System.out.println(area);
    }
}

public class Main {
    public static void main(String[] args) {

        //Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(10.0, 15.0);
        //forma.calcolaArea();
        rettangolo.calcolaArea();

    }
}
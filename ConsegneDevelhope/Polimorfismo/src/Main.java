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
        System.out.println("Rettangolo: " + area);
    }
}

class Triangolo extends Forma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2.0;
        System.out.println("L'area del triangolo è: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        //Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(10.0, 15.0);
        //forma.calcolaArea();
        rettangolo.calcolaArea();
        Triangolo triangolo = new Triangolo(5.0, 4.0);
        triangolo.calcolaArea();
    }
}

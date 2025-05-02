// Enum per identificare il tipo di forma
enum TipoForma {
    TRIANGOLO, RETTANGOLO;
}

// Classe astratta Forma
abstract class Forma {
    protected TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public abstract void calcolaArea();
}

// Classe Triangolo che estende Forma
class Triangolo extends Forma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        super(TipoForma.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("L'area del " + tipo + " è: " + area);
    }
}

// Classe Rettangolo che estende Forma
class Rettangolo extends Forma {
    private double larghezza;
    private double altezza;

    public Rettangolo(double larghezza, double altezza) {
        super(TipoForma.RETTANGOLO);
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = larghezza * altezza;
        System.out.println("L'area del " + tipo + " è: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangolo t = new Triangolo(5, 10);
        Rettangolo r = new Rettangolo(4, 6);

        t.calcolaArea();
        r.calcolaArea();
    }
}

abstract class Forma {

    public abstract void calcolaArea();

}

class Rettangolo extends Forma {

    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza){
    this.larghezza = larghezza;
    this.lunghezza = lunghezza;
    }

    @Override
    public void calcolaArea(){
        double area = lunghezza * larghezza;
        System.out.println("L'area del rettangolo è: " + area);
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
    public void calcolaArea(){
        double area = (base * altezza) / 2;
        System.out.println("L'area del triangolo è: " + area);
    }

}


public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);
        rettangolo.calcolaArea();
        Triangolo triangolo = new Triangolo(10.0, 3.0);
        triangolo.calcolaArea();

    }
}
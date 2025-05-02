package Factory;

public class Main {
    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.creaForma(tipoForma.CERCHIO);
        shape1.draw();

        for (tipoForma tipo : tipoForma.values()) {
            Shape forma = ShapeFactory.creaForma(tipo);
            System.out.print(tipo + ": ");
            forma.draw();
        }

    }
}
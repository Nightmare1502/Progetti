package Factory;

public class ShapeFactory {

    public static Shape creaForma(tipoForma tipo) {
        switch (tipo) {
            case QUADRATO:
                return new Quadrato();
            case RETTANGOLO:
                return new Rettangolo();
            case CERCHIO:
                return new Cerchio();
            default:
                throw new IllegalArgumentException("Tipo di forma non supportato: " + tipo);
        }
    }
}

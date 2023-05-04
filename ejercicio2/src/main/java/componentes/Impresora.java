package componentes;

public class Impresora extends Componente {
    private String tipoCartucho;
    protected int[] puertosValidos;

    public Impresora(String fabricante, String modelo, Double precioVenta, String tipoCartucho) {
        super(fabricante, modelo, precioVenta);
        this.tipoCartucho = tipoCartucho;
        this.puertosValidos = puertosValidos;
    }

    public String toString() {
        return super.toString() + " Impresora [tipoCartucho=" + this.tipoCartucho + "]";
    }
}

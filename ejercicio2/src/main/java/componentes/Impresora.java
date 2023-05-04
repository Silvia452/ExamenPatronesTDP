package componentes;

public class Impresora extends Componente {
    private String tipoCartucho;
    protected int[] puertosValidos;

    public Impresora(String fabricante, String modelo, Double precioVenta, String tipoCartucho, int[] puertosValidos) {
        super(fabricante, modelo, precioVenta);
        this.tipoCartucho = this.tipoCartucho;
        this.puertosValidos = puertosValidos;
    }

    public String toString() {
        return super.toString() + " Impresora [tipoCartucho=" + this.tipoCartucho + "]";
    }
}

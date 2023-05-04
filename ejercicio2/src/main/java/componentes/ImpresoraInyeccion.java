package componentes;

public class ImpresoraInyeccion extends Impresora{
    private String tipoCartucho;

    public ImpresoraInyeccion(String fabricante, String modelo, double precioVenta, String tipoCartucho, int[] puertosValidos) {
        super(fabricante, modelo, precioVenta, tipoCartucho);
        this.tipoCartucho = tipoCartucho;

    }

    public String getTipoCartucho() {
        return tipoCartucho;
    }
}

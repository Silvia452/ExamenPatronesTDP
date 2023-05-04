package componentes;

public class ImpresoraInyeccion extends Impresora{
    private String tipoCartucho;

    public ImpresoraInyeccion(String fabricante, String modelo, double precioVenta,int[] puertosValidos, String tipoCartucho) {
        super(fabricante, modelo, precioVenta, tipoCartucho, puertosValidos);
        this.tipoCartucho = tipoCartucho;

    }

    public String getTipoCartucho() {
        return tipoCartucho;
    }
}

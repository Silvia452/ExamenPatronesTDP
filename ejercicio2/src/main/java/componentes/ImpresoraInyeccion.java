package componentes;

import java.util.List;

public class ImpresoraInyeccion extends DispositivoSalida{
    private String tipoCartucho;

    public ImpresoraInyeccion(String fabricante, String modelo, double precioVenta, List<Integer> puertosValidos, String tipoCartucho) {
        super(fabricante, modelo, precioVenta, puertosValidos);
        this.tipoCartucho = tipoCartucho;

    }

    public String getTipoCartucho() {
        return tipoCartucho;
    }
}

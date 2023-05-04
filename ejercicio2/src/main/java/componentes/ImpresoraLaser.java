package componentes;

import java.util.List;

public class ImpresoraLaser extends DispositivoSalida{

    private int[] numPaginasImpresas;
    private String tipoCartucho;

    public ImpresoraLaser(String fabricante, String modelo, double precioVenta, List<Integer> puertosValidos, String tipoCartucho, int[] numPaginasImpresas) {
        super(fabricante, modelo, precioVenta, puertosValidos);
        this.tipoCartucho = tipoCartucho;
        this.numPaginasImpresas = numPaginasImpresas;

    }



}

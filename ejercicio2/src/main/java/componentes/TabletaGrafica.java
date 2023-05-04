package componentes;

import componentes.DispositivoEntrada;

import java.util.List;

public class TabletaGrafica extends DispositivoEntrada {
    public TabletaGrafica(String fabricante, String modelo, double precioVenta, String tipoConector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precioVenta, tipoConector, puertosValidos);
    }
}


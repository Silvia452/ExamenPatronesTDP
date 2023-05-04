package componentes;

import componentes.DispositivoEntrada;

import java.util.List;

public class Raton extends DispositivoEntrada {
    public Raton(String fabricante, String modelo, double precioVenta, String tipoConector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precioVenta, tipoConector, puertosValidos);
    }
}

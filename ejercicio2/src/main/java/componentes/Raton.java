package componentes;

import componentes.DispositivoEntrada;

import java.util.List;

public class Raton extends Componente {
    String tipoConector;
    int puertos;

    public Raton(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String toString() {
        return super.toString() + "Raton [puertos=" + this.puertos + ", tipoConector=" + this.tipoConector + "]";
    }
}

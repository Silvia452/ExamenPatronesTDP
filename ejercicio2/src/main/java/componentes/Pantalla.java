package componentes;

import java.util.List;

public class Pantalla extends Componente {
    String tipoConector;
    int puertos;

    public Pantalla(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String toString() {
        return super.toString() + " Pantalla [puertos=" + this.puertos + ", tipoConector=" + this.tipoConector + "]";
    }
}


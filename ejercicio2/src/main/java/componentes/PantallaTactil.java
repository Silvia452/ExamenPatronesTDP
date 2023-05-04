package componentes;

public class PantallaTactil extends Componente {
    private String tipoConector;
    private int puertos;

    public PantallaTactil(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String toString() {
        return super.toString() + " PantallaTactil [puertos=" + this.puertos + ", tipoConector=" + this.tipoConector + "]";
    }
}

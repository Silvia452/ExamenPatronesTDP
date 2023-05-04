package componentes;

public class ImpresoraLaser extends Impresora {
    int numPaginasImpresas;

    public ImpresoraLaser(String fabricante, String modelo, Double precioVenta, String tipoCartucho, int numPaginasImpresas, int[] puertosValidos) {
        super(fabricante, modelo, precioVenta, tipoCartucho);
        this.numPaginasImpresas = numPaginasImpresas;
    }

    public String toString() {
        return super.toString() + " ImpresoraLaser [numPaginasImpresas=" + this.numPaginasImpresas + "]";
    }
}

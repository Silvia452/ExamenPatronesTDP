// Clase abstracta Componente
public abstract class Componente {
    private String fabricante;
    private String modelo;
    private double precioVenta;

    public Componente(String fabricante, String modelo, double precioVenta) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}

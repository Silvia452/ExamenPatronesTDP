import java.util.List;

public abstract class DispositivoEntrada extends Componente {
    private String tipoConector;
    private List<Integer> puertosValidos;

    public DispositivoEntrada(String fabricante, String modelo, double precioVenta, String tipoConector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertosValidos = puertosValidos;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public List<Integer> getPuertosValidos() {
        return puertosValidos;
    }
}

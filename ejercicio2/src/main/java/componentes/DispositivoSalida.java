package componentes;

import java.util.List;

public abstract class DispositivoSalida extends Componente {
    protected List<Integer> puertosValidos;

    public DispositivoSalida(String fabricante, String modelo, double precioVenta, List<Integer> puertosValidos) {
        super(fabricante, modelo, precioVenta);
        this.puertosValidos = puertosValidos;
    }
}


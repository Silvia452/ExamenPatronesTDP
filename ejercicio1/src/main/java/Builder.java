import java.util.ArrayList;

public class Builder {
    private String nombre;
    private double tiempoMedioAsistencia;
    private ArrayList<Integer> numAmbulancias;

    public Builder() {}

    public Builder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Builder conTiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    public Base build() {
        return new Base(nombre, tiempoMedioAsistencia, numAmbulancias);
    }
}


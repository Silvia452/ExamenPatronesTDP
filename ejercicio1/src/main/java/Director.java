import java.util.ArrayList;

public class Director {
    public Base construirBaseEmergenciasConAmbulancias(String nombre, double tiempoMedioAsistencia, ArrayList<Integer> numAmbulancias) {
        return new Base (nombre, tiempoMedioAsistencia, numAmbulancias);
    }
}


import java.util.ArrayList;

public class Base {
    private String nombre;
    private double tiempoMedioAsistencia;
    private ArrayList<Integer> numAmbulancias;

    public Base(String nombre, double tiempoMedioAsistencia, ArrayList<Integer> numAmbulancias) {
        this.nombre = nombre;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        this.numAmbulancias = numAmbulancias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    public void setTiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public ArrayList<Integer> getNumAmbulancias() {
        return numAmbulancias;
    }

    public void setNumAmbulancias(ArrayList<Integer> numAmbulancias) {
        this.numAmbulancias = numAmbulancias;
    }
}

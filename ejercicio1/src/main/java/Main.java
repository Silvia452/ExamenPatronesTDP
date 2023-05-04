import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Base base = director.construirBaseEmergenciasConAmbulancias("Villanueva de la Cañada", 10.0, new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        System.out.println(base.getNombre());
        System.out.println(base.getTiempoMedioAsistencia());
        System.out.println(base.getNumAmbulancias());

    }
}

package ordenadores;

import componentes.*;

class Ordenador {
    private final Impresora impresora;
    private final Pantalla pantalla;
    private final Raton raton;
    private final Teclado teclado;
    private final TabletaGrafica tableta;
    private final PantallaTactil pantallaTactil;

    public Ordenador(Impresora impresora, Pantalla pantalla, Raton raton, Teclado teclado, TabletaGrafica tableta, PantallaTactil pantallaTactil) {
        this.impresora = impresora;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.tableta = tableta;
        this.pantallaTactil = pantallaTactil;
    }

    public Impresora getImpresora() {
        return this.impresora;
    }

    public Pantalla getPantalla() {
        return this.pantalla;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public TabletaGrafica getTableta() {
        return this.tableta;
    }

    public PantallaTactil getPantallaTactil() {
        return this.pantallaTactil;
    }

    public String toString() {
        return "Ordenador [impresora=" + this.impresora + ", pantalla=" + this.pantalla + ", pantallaTactil=" + this.pantallaTactil + ", raton=" + this.raton + ", tableta=" + this.tableta + ", teclado=" + this.teclado + "]";
    }
}

package builders;

import componentes.Impresora;
import componentes.Pantalla;
import componentes.Raton;
import componentes.TabletaGrafica;
import componentes.Teclado;

public interface Builder {
    void setImpresora(Impresora var1);

    void setPantalla(Pantalla var1);

    void setRaton(Raton var1);

    void setTabletaGrafica(TabletaGrafica var1);

    void setTeclado(Teclado var1);
}

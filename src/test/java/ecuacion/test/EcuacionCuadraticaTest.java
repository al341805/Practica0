package ecuacion.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import ecuacion.Complejo;
import org.junit.Test;

import ecuacion.EcuacionCuadratica;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carles Torrat on 15/02/2017.
 */
public class EcuacionCuadraticaTest {

    @Test
    public void solucionesRealesTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1,-8,12); // x + 0 = 0
        List solucionesDeseadas = new ArrayList();
        solucionesDeseadas.add(2.0);
        solucionesDeseadas.add(6.0);
        assertThat(ecuacionCuadratica.getSolucion().getListaSoluciones().containsAll(solucionesDeseadas), is(true));

        solucionesDeseadas = new ArrayList();
        solucionesDeseadas.add(-6.0);
        solucionesDeseadas.add(2.0);
        ecuacionCuadratica = new EcuacionCuadratica(1,4,-12); // x + 0 = 0
        assertThat(ecuacionCuadratica.getSolucion().getListaSoluciones().containsAll(solucionesDeseadas), is(true));

        solucionesDeseadas = new ArrayList();
        solucionesDeseadas.add(5.0);
        solucionesDeseadas.add(-3.0);
        ecuacionCuadratica = new EcuacionCuadratica(1,-2,-15); // x + 0 = 0
        assertThat(ecuacionCuadratica.getSolucion().getListaSoluciones().containsAll(solucionesDeseadas), is(true));

        solucionesDeseadas = new ArrayList();
        solucionesDeseadas.add(2.0);
        solucionesDeseadas.add(-2.0);
        ecuacionCuadratica = new EcuacionCuadratica(1,0,-4); // x + 0 = 0
        assertThat(ecuacionCuadratica.getSolucion().getListaSoluciones().containsAll(solucionesDeseadas), is(true));

        solucionesDeseadas = new ArrayList();
        solucionesDeseadas.add(0.0);
        ecuacionCuadratica = new EcuacionCuadratica(1,0,0); // x + 0 = 0
        assertThat(ecuacionCuadratica.getSolucion().getListaSoluciones().containsAll(solucionesDeseadas), is(true));


    }

    @Test
    public void solucionesComplejasTest() {
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(2,-6,5); // x + 0 = 0
        Complejo complejoEsperado = new Complejo(3.0/2.0,1.0/2.0);
        List listaSoluciones = ecuacionCuadratica.getSolucion().getListaSoluciones();
        assertThat(listaSoluciones.get(0).equals(complejoEsperado), is(true));

        complejoEsperado = new Complejo(3.0/2.0,-1.0/2.0);
        assertThat(listaSoluciones.get(1).equals(complejoEsperado), is(true));

        ecuacionCuadratica = new EcuacionCuadratica(2,0,2); // x + 0 = 0
        complejoEsperado = new Complejo(0.0,1.0);
        listaSoluciones = ecuacionCuadratica.getSolucion().getListaSoluciones();
        assertThat(listaSoluciones.get(0).equals(complejoEsperado), is(true));

        complejoEsperado = new Complejo(0.0,-1.0);
        assertThat(listaSoluciones.get(1).equals(complejoEsperado), is(true));
    }

}

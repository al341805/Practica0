package ecuacion.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

import ecuacion.EcuacionLineal;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1); // x + 0 = 0
		assertThat(ecuacionLineal.getSolucion().getListaSoluciones().get(0), is(0.0));
		// A partir de aquí, el código que comprueba que la solución es correcta
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1.0); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionLineal.getSolucion().getListaSoluciones().get(0), is(-1.0));
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionLineal.getSolucion().getListaSoluciones().get(0), is(-0.5));
		ecuacionLineal = new EcuacionLineal(1, 1);
		assertThat(ecuacionLineal.getSolucion().getListaSoluciones().get(0), is(-1.0));
		ecuacionLineal = new EcuacionLineal(2, -2);
		assertThat(ecuacionLineal.getSolucion().getListaSoluciones().get(0), is(1.0));
		ecuacionLineal = new EcuacionLineal(2, -4);
		assertThat(ecuacionLineal.getSolucion().getListaSoluciones().get(0), is(2.0));
	}
}

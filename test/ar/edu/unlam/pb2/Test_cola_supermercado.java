package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_cola_supermercado {

	@Test
	public void queSeAgrupeGenteEnLaColaA() {
		Supermercado mercado = new Supermercado();
		Cliente a = new Cliente(3);
		Cliente b = new Cliente(10);

		mercado.formarClienteEnLaColaA(a);
		mercado.formarClienteEnLaColaA(b);

		Integer deseado = 2;
		Integer obtenido = mercado.cantidadDeGenteEnLaColaA();

		assertEquals(deseado, obtenido);
	}

	@Test
	public void queSeRepartaGenteEnLaColaBrecienAbierta() {
		Supermercado mercado = new Supermercado();
		Cliente a = new Cliente(3);
		Cliente b = new Cliente(10);

		mercado.formarClienteEnLaColaA(a);
		mercado.formarClienteEnLaColaA(b);

		mercado.abrirColaB();

		Integer deseadoA = 1;
		Integer obtenidoA = mercado.cantidadDeGenteEnLaColaA();

		Integer deseadoB = 1;
		Integer obtenidoB = mercado.cantidadDeGenteEnLaColaB();

		assertEquals(deseadoA, obtenidoA);
		assertEquals(deseadoB, obtenidoB);
	}

	@Test
	public void queSeRepartaGenteEnLaColaBEnBaseAlOrdenQueTenianEnLaColaA() {
		Supermercado mercado = new Supermercado();
		Cliente a = new Cliente(2);
		Cliente b = new Cliente(10);
		Cliente c = new Cliente(4);

		mercado.formarClienteEnLaColaA(a);
		mercado.formarClienteEnLaColaA(b);
		mercado.formarClienteEnLaColaA(c);

		mercado.abrirColaB();

		assertEquals(a.getPosicion(), (Integer) 1);
		assertEquals(b.getPosicion(), (Integer) 1);
		assertEquals(c.getPosicion(), (Integer) 2);
	}

}

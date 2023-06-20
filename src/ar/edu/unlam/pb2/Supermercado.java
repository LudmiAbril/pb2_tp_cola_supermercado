package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Iterator;

public class Supermercado {
	ArrayList<Cliente> colaA = new ArrayList<Cliente>();
	ArrayList<Cliente> colaB = new ArrayList<Cliente>();

	public void formarClienteEnLaColaA(Cliente cliente) {
		this.colaA.add(cliente);
		cliente.setPosicion(colaA.indexOf(cliente) + 1);
	}

	public void abrirColaB() {
		Iterator<Cliente> itr = colaA.iterator();
		Integer movidos = 0;
		Integer posB = 0;

		while (itr.hasNext()) {
			Cliente c = (Cliente) itr.next();

			if (c.getCantidadDeProductos() < 5) {
				movidos++;
				posB++;
				c.setPosicion(posB);
				colaB.add(c);
				itr.remove();
			} else {
				c.setPosicion(c.getPosicion() - movidos);
			}

		}
	}

	public Integer cantidadDeGenteEnLaColaA() {
		return this.colaA.size();
	}

	public Integer cantidadDeGenteEnLaColaB() {
		return this.colaB.size();
	}

}

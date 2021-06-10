package oracle;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.upeu.oracle.config.Conexion;

public class ConexionTest {

	@Test
	public void test() {
		assertEquals(null, Conexion.getConexion());
	}

}

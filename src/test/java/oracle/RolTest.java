package oracle;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.oracle.dao.RolDao;
import pe.edu.upeu.oracle.daoImpl.RolDaoImpl;
import pe.edu.upeu.oracle.entity.Rol;



public class RolTest {

	private RolDao udao;
	@Before
	public void before() {
		udao = new RolDaoImpl();
	}
	@Test
	public void validar() {
		List<Rol> resultado = udao.readAll();
		String rol = resultado.get(0).getNomrol();
		String esperado = "dsdsds";
		assertEquals(esperado, rol);
	}

}

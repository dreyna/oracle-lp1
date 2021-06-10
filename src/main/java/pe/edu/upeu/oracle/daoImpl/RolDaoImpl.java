package pe.edu.upeu.oracle.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.oracle.config.Conexion;
import pe.edu.upeu.oracle.dao.RolDao;
import pe.edu.upeu.oracle.entity.Rol;

public class RolDaoImpl implements RolDao {
private PreparedStatement ps;
private ResultSet rs;
private Connection cx = null;
	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from rol";
		List<Rol> lista = new ArrayList<>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery();
			while(rs.next()) {
				Rol r = new Rol();
				r.setIdrol(rs.getInt("ID_ROL"));
				r.setNomrol(rs.getString("NOMROL"));
				r.setEstado(rs.getInt("ESTADO"));
				lista.add(r);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		return lista;
	}

}

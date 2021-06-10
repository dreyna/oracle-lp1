package pe.edu.upeu.oracle.entity;

public class Rol {
private int idrol;
private String nomrol;
private int estado;
public Rol() {
}
public Rol(String nomrol, int estado) {
	this.nomrol = nomrol;
	this.estado = estado;
}
public int getIdrol() {
	return idrol;
}
public void setIdrol(int idrol) {
	this.idrol = idrol;
}
public String getNomrol() {
	return nomrol;
}
public void setNomrol(String nomrol) {
	this.nomrol = nomrol;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}

}

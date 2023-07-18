package com.mx.proyecto.Dto;

public class EmpleadosAdminDto {

	private long id_Empleado;
	private String nombre_Completo;
	private String rfc;
	private String curp;
	private int edad;
	private String sexo;
	private String direccion;
	private long nss;
	private long telefono;
	private int activo;
	
	public long getId_Empleado() {
		return id_Empleado;
	}
	public void setId_Empleado(long id_Empleado) {
		this.id_Empleado = id_Empleado;
	}
	public String getNombre_Completo() {
		return nombre_Completo;
	}
	public void setNombre_Completo(String nombre_Completo) {
		this.nombre_Completo = nombre_Completo;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getNss() {
		return nss;
	}
	public void setNss(long nss) {
		this.nss = nss;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}

	

}/// fin de la clase

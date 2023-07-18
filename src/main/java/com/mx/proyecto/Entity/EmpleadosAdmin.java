package com.mx.proyecto.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity // Anotacion para indicarle que esta clase va a ser una entity/entidad
@Table(name = "EMPLEADOS_ADMIN", schema = "CursoBDhugo") // Anotacion table donde indicamos el nombre de la tabla y el esquema

public class EmpleadosAdmin {

	
	     @Column(name = "ID_EMPLEADO", length = 100)
	     private Long ID_EMPLEADO;
		
	     @Column(name = "NOMBRE_COMPLETO", length = 100)
		private String nombreCompleto;
		
		@Column(name = "RFC", length = 100)
		private String rfc;
		
		@Column(name = "CURP", length = 100)
		private String curp;
		
		@Column(name = "EDAD")
		private int edad;
		
		@Column(name = "SEXO")
		private String sexo;
		
		@Column(name = "DIRECCION")
		private String direccion;
		
		@Column(name = "NSS")
		private long NSS;
		
		@Column(name = "TELEFONO")
		private long TELEFONO;
		
		@Column(name = "ACTIVO")
		private int activo;

		public Long getID_EMPLEADO() {
			return ID_EMPLEADO;
		}

		public void setID_EMPLEADO(Long iD_EMPLEADO) {
			ID_EMPLEADO = iD_EMPLEADO;
		}

		public String getNombreCompleto() {
			return nombreCompleto;
		}

		public void setNombreCompleto(String nombreCompleto) {
			this.nombreCompleto = nombreCompleto;
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

		public long getNSS() {
			return NSS;
		}

		public void setNSS(long nSS) {
			NSS = nSS;
		}

		public long getTELEFONO() {
			return TELEFONO;
		}

		public void setTELEFONO(long tELEFONO) {
			TELEFONO = tELEFONO;
		}

		public int getActivo() {
			return activo;
		}

		public void setActivo(int activo) {
			this.activo = activo;
		}

		
}


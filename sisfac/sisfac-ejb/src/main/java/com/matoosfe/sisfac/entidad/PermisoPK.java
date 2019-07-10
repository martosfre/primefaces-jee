package com.matoosfe.sisfac.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PermisoPK implements Serializable{

	@Column(name = "rol_codigo")
	private int rolCodigo;
	@Column(name = "men_codigo")
	private int menCodigo;

	public PermisoPK() {
		// TODO Auto-generated constructor stub
	}

	public int getRolCodigo() {
		return rolCodigo;
	}

	public void setRolCodigo(int rolCodigo) {
		this.rolCodigo = rolCodigo;
	}

	public int getMenCodigo() {
		return menCodigo;
	}

	public void setMenCodigo(int menCodigo) {
		this.menCodigo = menCodigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + menCodigo;
		result = prime * result + rolCodigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermisoPK other = (PermisoPK) obj;
		if (menCodigo != other.menCodigo)
			return false;
		if (rolCodigo != other.rolCodigo)
			return false;
		return true;
	}

}

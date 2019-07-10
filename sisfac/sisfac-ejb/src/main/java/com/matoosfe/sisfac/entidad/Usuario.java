package com.matoosfe.sisfac.entidad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="usu_clave")
	private String usuClave;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usu_codigo")
	private int usuCodigo;

	@Temporal(TemporalType.DATE)
	@Column(name="usu_fecha_creacion")
	private Date usuFechaCreacion;

	@Column(name="usu_usuario")
	private String usuUsuario;

	//bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name="rol_codigo", referencedColumnName="rol_codigo")
	private Rol rol;

	public Usuario() {
	}

	public String getUsuClave() {
		return this.usuClave;
	}

	public void setUsuClave(String usuClave) {
		this.usuClave = usuClave;
	}

	public int getUsuCodigo() {
		return this.usuCodigo;
	}

	public void setUsuCodigo(int usuCodigo) {
		this.usuCodigo = usuCodigo;
	}

	public Date getUsuFechaCreacion() {
		return this.usuFechaCreacion;
	}

	public void setUsuFechaCreacion(Date usuFechaCreacion) {
		this.usuFechaCreacion = usuFechaCreacion;
	}

	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
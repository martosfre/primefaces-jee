package com.matoosfe.sisfac.entidad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the permiso database table.
 * 
 */
@Entity
@Table(name = "permiso")
@NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PermisoPK permisoId;

	@Column(name = "per_editar")
	private int perEditar;

	@Column(name = "per_eliminar")
	private int perEliminar;

	@Temporal(TemporalType.DATE)
	@Column(name = "per_fecha")
	private Date perFecha;

	@Column(name = "per_guardar")
	private int perGuardar;

	// bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name = "men_codigo", referencedColumnName = "men_codigo", insertable = false, updatable = false)
	private Menu menu;

	// bi-directional many-to-one association to Rol
	@ManyToOne
	@JoinColumn(name = "rol_codigo", referencedColumnName = "rol_codigo", insertable = false, updatable = false)
	private Rol rol;

	public Permiso() {
	}

	public PermisoPK getPermisoId() {
		return permisoId;
	}

	public void setPermisoId(PermisoPK permisoId) {
		this.permisoId = permisoId;
	}

	public int getPerEditar() {
		return this.perEditar;
	}

	public void setPerEditar(int perEditar) {
		this.perEditar = perEditar;
	}

	public int getPerEliminar() {
		return this.perEliminar;
	}

	public void setPerEliminar(int perEliminar) {
		this.perEliminar = perEliminar;
	}

	public Date getPerFecha() {
		return this.perFecha;
	}

	public void setPerFecha(Date perFecha) {
		this.perFecha = perFecha;
	}

	public int getPerGuardar() {
		return this.perGuardar;
	}

	public void setPerGuardar(int perGuardar) {
		this.perGuardar = perGuardar;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
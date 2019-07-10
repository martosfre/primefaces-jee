package com.matoosfe.sisfac.seguridad.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.matoosfe.sisfac.core.AbstractManagedBean;
import com.matoosfe.sisfac.entidad.Usuario;
import com.matoosfe.sisfac.negocio.UsuarioFacade;

@ManagedBean
@SessionScoped
public class LoginBean extends AbstractManagedBean {
	private String usuario;
	private String clave;
	private Usuario usuarioSession;

	@EJB
	private UsuarioFacade adminUsuario;

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	public Usuario getUsuarioSession() {
		return usuarioSession;
	}

	public void setUsuarioSession(Usuario usuarioSession) {
		this.usuarioSession = usuarioSession;
	}

	/**
	 * Metodo para validar el usuario
	 */
	public void validarUsuario() {
		try {
			usuarioSession = adminUsuario.validarUsuario(usuario, clave);
			FacesContext.getCurrentInstance().getExternalContext().redirect("./principal.mat");
		} catch (Exception e) {
			anadirMensajeError(e.getMessage());
		}
	}

}

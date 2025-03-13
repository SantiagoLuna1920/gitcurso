package com.giitic.controllerBean;

import com.giitic.bean.SelecCursosBean;

public class LoginController {
	private SelecCursosBean selecCursosBean;
	private String mensaje;
	
	public String verificarUsuario() {
		if(selecCursosBean.getEmail().equalsIgnoreCase("santiago.luna@giitic.com")) {
			return "success";
		} else {
			mensaje =  "Fallo al ingresar";
			return "failure";
		}
	}
	
	public String cerrarSesion() {
		return "success";
	}

	public SelecCursosBean getSelecCursosBean() {
		return selecCursosBean;
	}

	public void setSelecCursosBean(SelecCursosBean selecCursosBean) {
		this.selecCursosBean = selecCursosBean;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}

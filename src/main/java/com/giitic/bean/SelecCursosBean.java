package com.giitic.bean;

public class SelecCursosBean {
	
	private String curso;
	private String email;
	private String mensaje;
	private String password;
	
	public SelecCursosBean() {
	}
	



  public void procesar() {
		this.mensaje = curso;
	}


	
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso( String curso ) {
		this.curso = curso;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail( String email ) {
		this.email = email;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

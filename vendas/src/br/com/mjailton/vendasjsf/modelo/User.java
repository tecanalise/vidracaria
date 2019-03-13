package br.com.mjailton.vendasjsf.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_usuario")
private Long idUsuario;
private String usuario;
private String senha;
public Long getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(Long idUsuario) {
	this.idUsuario = idUsuario;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}


}

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
public class Formpagamento {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_formpagamento")
private Long idFormpagamento;
private String tipo;
private String descricao;
private String prazo;
private String pesocomercial;
private String pesodesconto;
public Long getIdFormpagamento() {
	return idFormpagamento;
}
public void setIdFormpagamento(Long idFormpagamento) {
	this.idFormpagamento = idFormpagamento;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String getPrazo() {
	return prazo;
}
public void setPrazo(String prazo) {
	this.prazo = prazo;
}
public String getPesocomercial() {
	return pesocomercial;
}
public void setPesocomercial(String pesocomercial) {
	this.pesocomercial = pesocomercial;
}
public String getPesodesconto() {
	return pesodesconto;
}
public void setPesodesconto(String pesodesconto) {
	this.pesodesconto = pesodesconto;
}






}

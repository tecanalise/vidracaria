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
public class Saidadinheiro {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_saidadinheiro")
private Long idSaidadinheiro;
private String descricao;
private Double valor;
public Long getIdSaidadinheiro() {
	return idSaidadinheiro;
}
public void setIdSaidadinheiro(Long idSaidadinheiro) {
	this.idSaidadinheiro = idSaidadinheiro;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}



}

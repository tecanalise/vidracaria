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
public class Compra {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_compra")
private Long idCompra;
private String descricao;
private Double valor;
public Long getIdCompra() {
	return idCompra;
}
public void setIdCompra(Long idCompra) {
	this.idCompra = idCompra;
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

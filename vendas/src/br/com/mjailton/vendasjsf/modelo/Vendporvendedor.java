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
public class Vendporvendedor {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_vendporvendedor")
private Long idVendporvendedor;
private String nome;
private String quantidade;
private Double valor;
public Long getIdVendporvendedor() {
	return idVendporvendedor;
}
public void setIdVendporvendedor(Long idVendporvendedor) {
	this.idVendporvendedor = idVendporvendedor;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getQuantidade() {
	return quantidade;
}
public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}



}

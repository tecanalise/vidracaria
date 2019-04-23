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
public class Preco {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_preco")
private Long idPreco;
private String nome;
private Double precovenda;
private String prazoentrega;
public Long getIdPreco() {
	return idPreco;
}
public void setIdPreco(Long idPreco) {
	this.idPreco = idPreco;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getPrecovenda() {
	return precovenda;
}
public void setPrecovenda(Double precovenda) {
	this.precovenda = precovenda;
}
public String getPrazoentrega() {
	return prazoentrega;
}
public void setPrazoentrega(String prazoentrega) {
	this.prazoentrega = prazoentrega;
}

}

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
public class Medida {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_medida")
private Long idMedida;
private String nome;
private String vidro;
private String tamanhoum;
private String tamanhodois;
private String quantidade;
public Long getIdMedida() {
	return idMedida;
}
public void setIdMedida(Long idMedida) {
	this.idMedida = idMedida;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getVidro() {
	return vidro;
}
public void setVidro(String vidro) {
	this.vidro = vidro;
}
public String getTamanhoum() {
	return tamanhoum;
}
public void setTamanhoum(String tamanhoum) {
	this.tamanhoum = tamanhoum;
}
public String getTamanhodois() {
	return tamanhodois;
}
public void setTamanhodois(String tamanhodois) {
	this.tamanhodois = tamanhodois;
}
public String getQuantidade() {
	return quantidade;
}
public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}


}

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
public class Movimento {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_movimento")
private Long idMovimento;
private String entradadinheiroaodia;
private String saidadinheiroaodia;
public Long getIdMovimento() {
	return idMovimento;
}
public void setIdMovimento(Long idMovimento) {
	this.idMovimento = idMovimento;
}
public String getEntradadinheiroaodia() {
	return entradadinheiroaodia;
}
public void setEntradadinheiroaodia(String entradadinheiroaodia) {
	this.entradadinheiroaodia = entradadinheiroaodia;
}
public String getSaidadinheiroaodia() {
	return saidadinheiroaodia;
}
public void setSaidadinheiroaodia(String saidadinheiroaodia) {
	this.saidadinheiroaodia = saidadinheiroaodia;
}



}

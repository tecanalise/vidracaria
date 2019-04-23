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
public class Servico {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_servico")
private Long idServico;
private String nome;
private String endereco;
private String telefone;
private String status;
public Long getIdServico() {
	return idServico;
}
public void setIdServico(Long idServico) {
	this.idServico = idServico;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}

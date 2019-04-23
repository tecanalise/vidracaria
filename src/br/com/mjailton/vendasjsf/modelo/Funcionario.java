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
public class Funcionario {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_funcionario")
private Long idFuncionario;
private String nome;
private String endereco;
private String bairro;
private String cidade;
private String uf;
private String cpf;
private String cep;
private String telefone;
private String contato;
private String complemento;
private String rg;
private Double comissao;
private String email;



public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public Long getIdFuncionario() {
	return idFuncionario;
}
public void setIdFuncionario(Long idFuncionario) {
	this.idFuncionario = idFuncionario;
}
public String getContato() {
	return contato;
}
public void setContato(String contato) {
	this.contato = contato;
}
public Double getComissao() {
	return comissao;
}
public void setComissao(Double comissao) {
	this.comissao = comissao;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getUf() {
	return uf;
}
public void setUf(String uf) {
	this.uf = uf;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}

public String getNome() {
	return nome;
}
public void setNome(String cliente) {
	this.nome = cliente;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}

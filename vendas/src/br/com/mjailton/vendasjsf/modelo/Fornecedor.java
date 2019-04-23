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
public class Fornecedor {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_fornecedor")
private Long idFornecedor;
private String razaosocial;
private String nomefantasia;
private String endereco;
private String bairro;
private String cidade;
private String complemento;
private String cep;
private String uf;
private String cnpj;
private String email;
private String telefone;
public Long getIdFornecedor() {
	return idFornecedor;
}
public void setIdFornecedor(Long idFornecedor) {
	this.idFornecedor = idFornecedor;
}
public String getRazaosocial() {
	return razaosocial;
}
public void setRazaosocial(String razaosocial) {
	this.razaosocial = razaosocial;
}
public String getNomefantasia() {
	return nomefantasia;
}
public void setNomefantasia(String nomefantasia) {
	this.nomefantasia = nomefantasia;
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
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getUf() {
	return uf;
}
public void setUf(String uf) {
	this.uf = uf;
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

}

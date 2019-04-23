package br.com.mjailton.vendasjsf.modelo;

import java.io.Serializable;
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
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = -6708700734432227805L;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_cliente")
private Long idCliente;
@Column(name = "nome")
private String nome;
@Column(name = "endereco")
private String endereco;
@Column(name = "cpf")
private String cpf;
@Column(name = "bairro")
private String bairro;
@Column(name = "cidade")
private String cidade;
@Column(name = "uf")
private String uf;
@Column(name = "cep")
private String cep;
@Column(name = "telefone")
private String telefone;
@Column(name = "complemento")
private String complemento;
@Column(name = "rg")
private String rg;
@Column(name = "email")
private String email;



public static long getSerialversionuid() {
	return serialVersionUID;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
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

public Long getIdCliente() {
	return idCliente;
}
public void setIdCliente(Long id_cliente) {
	this.idCliente = id_cliente;
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
	result = prime * result + ((cep == null) ? 0 : cep.hashCode());
	result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
	result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
	result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
	result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	result = prime * result + ((rg == null) ? 0 : rg.hashCode());
	result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
	result = prime * result + ((uf == null) ? 0 : uf.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	if (bairro == null) {
		if (other.bairro != null)
			return false;
	} else if (!bairro.equals(other.bairro))
		return false;
	if (cep == null) {
		if (other.cep != null)
			return false;
	} else if (!cep.equals(other.cep))
		return false;
	if (cidade == null) {
		if (other.cidade != null)
			return false;
	} else if (!cidade.equals(other.cidade))
		return false;
	if (complemento == null) {
		if (other.complemento != null)
			return false;
	} else if (!complemento.equals(other.complemento))
		return false;
	if (cpf == null) {
		if (other.cpf != null)
			return false;
	} else if (!cpf.equals(other.cpf))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (endereco == null) {
		if (other.endereco != null)
			return false;
	} else if (!endereco.equals(other.endereco))
		return false;
	if (idCliente == null) {
		if (other.idCliente != null)
			return false;
	} else if (!idCliente.equals(other.idCliente))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (rg == null) {
		if (other.rg != null)
			return false;
	} else if (!rg.equals(other.rg))
		return false;
	if (telefone == null) {
		if (other.telefone != null)
			return false;
	} else if (!telefone.equals(other.telefone))
		return false;
	if (uf == null) {
		if (other.uf != null)
			return false;
	} else if (!uf.equals(other.uf))
		return false;
	return true;
}
@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf
			+ ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", telefone=" + telefone
			+ ", complemento=" + complemento + ", rg=" + rg + ", email=" + email + "]";
}



}

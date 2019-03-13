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
public class Profornecedor {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_produtoFornecedor")
private Long idProdutoFornecedor;
private String nomeproduto;
private String precovenda;
private String prazoentrega;
public Long getIdProdutoFornecedor() {
	return idProdutoFornecedor;
}
public void setIdProdutoFornecedor(Long idProdutoFornecedor) {
	this.idProdutoFornecedor = idProdutoFornecedor;
}
public String getNomeproduto() {
	return nomeproduto;
}
public void setNomeproduto(String nomeproduto) {
	this.nomeproduto = nomeproduto;
}
public String getPrecovenda() {
	return precovenda;
}
public void setPrecovenda(String precovenda) {
	this.precovenda = precovenda;
}
public String getPrazoentrega() {
	return prazoentrega;
}
public void setPrazoentrega(String prazoentrega) {
	this.prazoentrega = prazoentrega;
}




}

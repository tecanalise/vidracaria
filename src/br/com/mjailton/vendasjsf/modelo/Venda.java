package br.com.mjailton.vendasjsf.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_venda")
private Long idVenda;

public Long getIdVenda() {
	return idVenda;
}

public void setIdVenda(Long idVenda) {
	this.idVenda = idVenda;
}



}

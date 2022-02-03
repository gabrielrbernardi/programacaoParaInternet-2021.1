package com.example.atividade5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CDomainClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String pedido;
	private String produto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "CDomainClass [id=" + id + ", pedido=" + pedido + ", produto=" + produto + "]";
	}
}

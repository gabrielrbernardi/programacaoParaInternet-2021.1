package com.example.atividade4;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CDomainClass {
	private Long id;
	@NotNull
	@Size(min=3, max=30)
	private String produto;
	@NotNull
	private String descricao;
	
	public CDomainClass() {};
	
	public CDomainClass(String produto, String descricao) {
		this.produto = produto;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CDomainClass [id=" + id + ", produto=" + produto + ", descricao=" + descricao + "]";
	}
}

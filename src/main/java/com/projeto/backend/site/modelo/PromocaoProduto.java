package com.projeto.backend.site.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PromocaoProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	
	private Double precoPromocaoProduto;
	
	
	@ManyToMany
	@JoinTable(
			  name = "PromocaoProduto", 
			  joinColumns = @JoinColumn(name = "idPromocaoProduto"), 
			  inverseJoinColumns = @JoinColumn(name = "idProduto"))
	private List<Produto> produtos;
	
}

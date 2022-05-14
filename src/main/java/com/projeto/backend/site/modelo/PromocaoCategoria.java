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
public class PromocaoCategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPromocaoCategoria;
	
	
	private Double precoPromocaoCategoria;
	
	@ManyToMany
	@JoinTable(
			  name = "PromocaoCategoria", 
			  joinColumns = @JoinColumn(name = "idPromocaoCategoria"), 
			  inverseJoinColumns = @JoinColumn(name = "idCategoria"))
	private List<Categoria> categorias;
}

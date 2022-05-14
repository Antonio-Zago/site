package com.projeto.backend.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.backend.site.modelo.Categoria;
import com.projeto.backend.site.modelo.Produto;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}

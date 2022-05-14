package com.projeto.backend.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.backend.site.dto.CategoriaDto;
import com.projeto.backend.site.modelo.Categoria;
import com.projeto.backend.site.repository.CategoriaRepository;



@RestController
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	@RequestMapping("/topicos")
	public List<CategoriaDto> Lista() {
		
		List<Categoria> categorias = categoriaRepository.findAll();

		return CategoriaDto.converter(categorias);
	}
		
}


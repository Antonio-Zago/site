package com.projeto.backend.site.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.backend.site.dto.CategoriaDto;
import com.projeto.backend.site.modelo.Categoria;
import com.projeto.backend.site.repository.CategoriaRepository;




@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	@GetMapping
	public List<CategoriaDto> Lista() {
		
		List<Categoria> categorias = categoriaRepository.findAll();

		return CategoriaDto.converter(categorias);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaDto> findById(@PathVariable Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		
		if(categoria.isPresent()) {
			return ResponseEntity.ok(new CategoriaDto(categoria.get()));
		}
		
		return ResponseEntity.notFound().build();
	} 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Integer id){
		
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		
		if(categoria.isPresent()) {
			categoriaRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		
		
		return ResponseEntity.notFound().build();
	}
		
}


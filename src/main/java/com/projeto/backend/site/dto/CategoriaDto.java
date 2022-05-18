package com.projeto.backend.site.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.projeto.backend.site.modelo.Categoria;


public class CategoriaDto {

		private Integer idCategoria;
		private String nomeCategoria;
		
		public CategoriaDto() {}
		
		public CategoriaDto(Categoria categoria) {
			this.idCategoria = categoria.getIdCategoria();
			this.nomeCategoria = categoria.getNomeCategoria();
		}
		
		public static List<CategoriaDto> converter(List<Categoria> categorias){
			List<CategoriaDto> categoriasDto = new ArrayList<>();
			
			for(Categoria categoria : categorias) {
				CategoriaDto categoriaDto = new CategoriaDto(categoria);
				categoriasDto.add(categoriaDto);
			}
			
			
			//return categorias.stream().map(CategoriaDto::new).collect(Collectors.toList());
			
			return categoriasDto;
		}

		public Integer getIdCategoria() {
			return idCategoria;
		}

		public void setIdCategoria(Integer idCategoria) {
			this.idCategoria = idCategoria;
		}

		public String getNomeCategoria() {
			return nomeCategoria;
		}

		public void setNomeCategoria(String nomeCategoria) {
			this.nomeCategoria = nomeCategoria;
		}

}

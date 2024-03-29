package com.generation.farmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id // Primary Key //
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;

	@Column(length = 80)
	@NotBlank(message = "O Atributo nome é obrigatório!")
	@Size(min = 5, max = 80, message = "O Atributo nome deve conter no mínimo 5 e no máximo 80 caracteres.")
	private String nomeCategoria;

	@Column(length = 50)
	@NotBlank(message = "O Atributo tipo é obrigatório!")
	@Size(min = 5, max = 50, message = "O Atributo tipo deve conter no mínimo 10 e no máximo 50 caracteres.")
	private String tipo;

	public Long getId() {
		return id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}

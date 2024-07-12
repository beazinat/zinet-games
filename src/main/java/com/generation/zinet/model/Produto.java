package com.generation.zinet.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório!")
    @Size(min = 3, max = 255, message = "O nome deve conter no mínimo 03 e no máximo 255 caracteres")
    private String nome;

    @NotBlank(message = "A descrição é obrigatória!")
    @Size(min = 10, message = "A descrição deve conter no mínimo 10 caracteres")
    private String descricao;
    
    @NotNull(message = "O preço é obrigatório!")
    private Double preco;

    @NotBlank(message = "O desenvolvedor é obrigatório!")
    private String desenvolvedor;

    @NotBlank(message = "A publicadora é obrigatória!")
    private String publicadora;

    @NotNull(message = "A data de lançamento é obrigatória!")
    private Date dataLancamento;

    @NotBlank(message = "A plataforma é obrigatória!")
    private String plataforma;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    @JoinColumn(name = "categoria_id", nullable = false)
    @NotNull(message = "A categoria é obrigatória!")
    private Categoria categoria;

    @NotBlank(message = "A classificação etária é obrigatória!")
    private String classificacaoEtaria;

    @NotNull(message = "A quantidade em estoque é obrigatória!")
    private Integer quantidadeEstoque;

    private String imagemUrl;

    private String requisitosSistema;

    private String idioma;

    @NotBlank(message = "O formato é obrigatório!")
    private String formato;

    private Double avaliacao;

    private Integer numeroAvaliacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getPublicadora() {
		return publicadora;
	}

	public void setPublicadora(String publicadora) {
		this.publicadora = publicadora;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getClassificacaoEtaria() {
		return classificacaoEtaria;
	}

	public void setClassificacaoEtaria(String classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public String getRequisitosSistema() {
		return requisitosSistema;
	}

	public void setRequisitosSistema(String requisitosSistema) {
		this.requisitosSistema = requisitosSistema;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Integer getNumeroAvaliacoes() {
		return numeroAvaliacoes;
	}

	public void setNumeroAvaliacoes(Integer numeroAvaliacoes) {
		this.numeroAvaliacoes = numeroAvaliacoes;
	}
    
}
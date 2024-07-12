package com.generation.zinet.repository;

import com.generation.zinet.model.Produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> getAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}

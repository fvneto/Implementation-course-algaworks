package com.vicente.algamoney.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.vicente.algamoney.api.model.Pessoa;
import com.vicente.algamoney.api.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long codigo, Pessoa pessoa) {

	  Pessoa pessoaSalva = this.pessoaRepository.findById(codigo)
	      .orElseThrow(() -> new EmptyResultDataAccessException(1));

	  BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");

	  return this.pessoaRepository.save(pessoaSalva);
	  
	} //atualizar
	
	//
	public Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
		
		if (!pessoaSalva.isPresent()) {
			
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva.get();
	
	}
}

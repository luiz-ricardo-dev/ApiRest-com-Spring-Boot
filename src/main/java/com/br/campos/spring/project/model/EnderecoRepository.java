package com.br.campos.spring.project.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}

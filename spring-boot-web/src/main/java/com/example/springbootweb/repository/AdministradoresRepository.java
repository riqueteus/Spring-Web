package com.example.springbootweb.repository;

import com.example.springbootweb.models.Administrador;

import org.springframework.data.repository.CrudRepository;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer>{
    
}
//exemplo de herança com o extends e utilização do interface para herdar.
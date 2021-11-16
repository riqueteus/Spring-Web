package com.example.springbootweb.repository;

import com.example.springbootweb.models.Administrador;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer>{
    @Query(value="select CASE WHEN count(1) > 0 'true' ELSE 'false' END from administradores where id = :id", nativeQuery = true )
    public boolean exist(int id); //método para validar se o id existe
}
//exemplo de herança com o extends e utilização do interface para herdar.
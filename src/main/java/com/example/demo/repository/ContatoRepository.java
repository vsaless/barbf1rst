package com.example.demo.repository;

import com.example.demo.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity,Integer> {

    Integer countAllByCpf (String cpf);

}


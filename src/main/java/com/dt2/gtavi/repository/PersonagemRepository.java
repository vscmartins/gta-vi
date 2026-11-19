package com.dt2.gtavi.repository;


import com.dt2.gtavi.entity.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository< Personagem, Integer>{
}
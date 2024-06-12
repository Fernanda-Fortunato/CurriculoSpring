package com.example.crnanda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crnanda.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}
package com.example.crud.repository;

import com.example.crud.entity.estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<estudiante, Long>{
}

package com.example.crud.service;

import com.example.crud.entity.estudiante;
import com.example.crud.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    public List<estudiante>getEstudiantes(){
        return estudianteRepositorio.findAll();
    }
    public Optional<estudiante> getEstudiantes(long id){
        return estudianteRepositorio.findById(id);
    }
    public void saveOrUpdate(estudiante estudiante){
        estudianteRepositorio.save(estudiante);
    }
    public void delete(long id){
        estudianteRepositorio.deleteById(id);
    }
}

package com.example.crud.controller;

import com.example.crud.entity.estudiante;
import com.example.crud.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/estudiantes")
public class EstudianteController {


    @Autowired
    private  EstudianteService estudianteService;


   @GetMapping
    public List<estudiante> getAll() {
       return estudianteService.getEstudiantes();
   }

    @GetMapping("/{estudianteId}")
    public Optional<estudiante> getById(@PathVariable("estudianteId") long estudianteId){
        return estudianteService.getEstudiantes(estudianteId);
    }
    @PostMapping
    public void saveOrUpdate(@RequestBody estudiante estudiante){
         estudianteService.saveOrUpdate(estudiante);
    }

    @DeleteMapping("/{estudiantId}")
    public void delete(@PathVariable("estudianteId") Long estudiantId){
        estudianteService.delete(estudiantId);
    }
}

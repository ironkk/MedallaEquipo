package com.medallaequipo.Controller;
import com.medallaequipo.Entity.Atleta;
import com.medallaequipo.Repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/atletas")
    public class AtletaController{

        @Autowired
        private AtletaRepository atletaRepository;

        // Crear
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Atleta createPlayer(@RequestBody Atleta atleta) {
            return atletaRepository.save(atleta);
        }

        // Actualizar
        @PutMapping
        public Atleta updatePlayer(@RequestBody Atleta atleta) {
            return atletaRepository.save(atleta);
        }

        // LEER TODOS
        @GetMapping
        public List<Atleta> findAll() {
            return atletaRepository.findAll();
        }

        // LEER UNO
        @GetMapping("/{id}")
        public Atleta findById(@PathVariable Long id) {
            Atleta atleta = atletaRepository.findOne(id);
            return atleta;
        }

        // BORRAR por ID
        @DeleteMapping("/{id}")
        public void deleteEquipo(@PathVariable Long id) {
            atletaRepository.delete(id);
        }


    }

package com.medallaequipo.Controller;

import com.medallaequipo.Entity.Atleta;
import com.medallaequipo.Entity.Medalla;
import com.medallaequipo.Repository.MedallaRepository;
import com.sun.javafx.collections.MappingChange;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

/**
 * Created by dam on 30/11/16.
 */
public class MedallaController {

    @RestController
    @RequestMapping("/medallas")
    public class MedallaController {
        @Autowired
        private MedallaRepository medallaRepository;
        @GetMapping("/groupby/tipo")
        public MappingChange.Map<String, List<Atleta>> getMedallasGroupByTipo(){
            return medallaRepository
                    .findAll()
                    .parallelStream()
                    .collect(Collectors.groupingBy(Medalla::getTipoMedalla));
        }
}

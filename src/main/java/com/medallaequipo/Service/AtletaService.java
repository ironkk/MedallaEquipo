package com.medallaequipo.Service;

import com.medallaequipo.Entity.Atleta;
import com.medallaequipo.Repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by dam on 30/11/16.
 */

@Service
@Transactional
public class AtletaService {



@Autowired
    private AtletaRepository atletaRepository;


    public void registrarAtletas() {
        Atleta atleta1 = new Atleta();
        atleta1.setNombre("Javier");
        atleta1.setApellidos("Manzano");
        atleta1.setFechaNacimiento(LocalDate.of(1995,11,9));
        atleta1.setNacionalidad("Es");
        atletaRepository.save(atleta1);
    }





}

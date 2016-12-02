package com.medallaequipo.Repository;

import com.medallaequipo.Entity.Medalla;
import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dam on 2/12/16.
 */
public interface MedallaRepository extends JpaRepository<Medalla, Long> {
    List<Medalla> findByCompeticion(String nombre);
}

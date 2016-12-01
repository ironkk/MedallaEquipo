package com.medallaequipo.Repository;

import com.medallaequipo.Entity.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dam on 30/11/16.
 *
 */
@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long> {

}

package com.medallaequipo.Entity;

import javax.persistence.*;
/**
 * Created by dam on 30/11/16.
 */

@Entity
public class Medalla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long id;

    @Column
    public TipoMedalla tipoMedalla;

    @Column
    public String especialidad;

    @Column
    public String competicion;

    @ManyToOne
    private Atleta atleta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                '}';
    }

    public Medalla() {
    }

    public static void <K, T> K getTipoMedalla(T t) {
        System.out.println("YIYIA");
        return null;
    }
}

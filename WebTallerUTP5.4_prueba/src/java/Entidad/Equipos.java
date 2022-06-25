/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Equipos {
    
    String marca, modelo;
    int id_equipo, id_tipo_equipo, dni;
     boolean estado_equipo;
     public Equipos(){
}

    public Equipos(String marca, String modelo, int id_equipo, int id_tipo_equipo, int dni, boolean estado_equipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.id_equipo = id_equipo;
        this.id_tipo_equipo = id_tipo_equipo;
        this.dni = dni;
        this.estado_equipo = estado_equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_tipo_equipo() {
        return id_tipo_equipo;
    }

    public void setId_tipo_equipo(int id_tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado_equipo() {
        return estado_equipo;
    }

    public void setEstado_equipo(boolean estado_equipo) {
        this.estado_equipo = estado_equipo;
    }
 
     
}



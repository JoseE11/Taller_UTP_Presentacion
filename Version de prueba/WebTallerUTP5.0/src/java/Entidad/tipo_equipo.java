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
public class tipo_equipo {
    int id_tipo_equipo;
    String nombre_equipo;
 public tipo_equipo(){
     
 }
    public tipo_equipo(int id_tipo_equipo, String nombre_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
        this.nombre_equipo = nombre_equipo;
    }

    public int getId_tipo_equipo() {
        return id_tipo_equipo;
    }

    public void setId_tipo_equipo(int id_tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }
    
    
}

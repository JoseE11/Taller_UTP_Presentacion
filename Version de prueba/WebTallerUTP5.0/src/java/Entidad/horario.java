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
public class horario {
    int id_horario;
    String nombre_horario, descripcion_horario;

    public horario(){
        
    }
    public horario(int id_horario, String nombre_horario, String descripcion_horario) {
        this.id_horario = id_horario;
        this.nombre_horario = nombre_horario;
        this.descripcion_horario = descripcion_horario;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getNombre_horario() {
        return nombre_horario;
    }

    public void setNombre_horario(String nombre_horario) {
        this.nombre_horario = nombre_horario;
    }

    public String getDescripcion_horaio() {
        return descripcion_horario;
    }

    public void setDescripcion_horaio(String descripcion_horaio) {
        this.descripcion_horario = descripcion_horaio;
    }
    
    
}

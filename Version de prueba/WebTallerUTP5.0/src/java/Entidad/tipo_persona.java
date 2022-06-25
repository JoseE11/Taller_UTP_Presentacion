/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class tipo_persona {
    
    int id_tipo_persona;
    String nombre_tipo_persona, descripcion_tipo_persona;
    public tipo_persona(){

    }
    public tipo_persona(int id_tipo_persona, String nombre_tipo_persona, String descripcion_tipo_persona) {
        this.id_tipo_persona = id_tipo_persona;
        this.nombre_tipo_persona = nombre_tipo_persona;
        this.descripcion_tipo_persona = descripcion_tipo_persona;
    }

    public int getId_tipo_persona() {
        return id_tipo_persona;
    }

    public void setId_tipo_persona(int id_tipo_persona) {
        this.id_tipo_persona = id_tipo_persona;
    }

    public String getNombre_tipo_persona() {
        return nombre_tipo_persona;
    }

    public void setNombre_tipo_persona(String nombre_tipo_persona) {
        this.nombre_tipo_persona = nombre_tipo_persona;
    }

    public String getDescripcion_tipo_persona() {
        return descripcion_tipo_persona;
    }

    public void setDescripcion_tipo_persona(String descripcion_tipo_persona) {
        this.descripcion_tipo_persona = descripcion_tipo_persona;
    }
    
    
}

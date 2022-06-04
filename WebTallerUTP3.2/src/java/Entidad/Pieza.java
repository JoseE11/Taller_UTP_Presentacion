/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Pieza {
    String id_pieza, nombre_pieza, descripcion;
    boolean estado_pieza;

    public Pieza(String id_pieza, String nombre_pieza, String descripcion, boolean estado_pieza) {
        this.id_pieza = id_pieza;
        this.nombre_pieza = nombre_pieza;
        this.descripcion = descripcion;
        this.estado_pieza = estado_pieza;
    }

    public boolean isEstado_pieza() {
        return estado_pieza;
    }

    public void setEstado_pieza(boolean estado_pieza) {
        this.estado_pieza = estado_pieza;
    }

    public Pieza() {
    }
    

    public String getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(String id_pieza) {
        this.id_pieza = id_pieza;
    }

    public String getNombre_pieza() {
        return nombre_pieza;
    }

    public void setNombre_pieza(String nombre_pieza) {
        this.nombre_pieza = nombre_pieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
    
}

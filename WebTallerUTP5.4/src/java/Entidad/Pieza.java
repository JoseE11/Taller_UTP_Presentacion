/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Pieza {
    int id_pieza , estado_pieza;
    String nombre_pieza, descripcion;
    
    
    
    
        public Pieza(int id_pieza, int estado_pieza, String nombre_pieza, String descripcion) {
        this.id_pieza = id_pieza;
        this.estado_pieza = estado_pieza;
        this.nombre_pieza = nombre_pieza;
        this.descripcion = descripcion;
    }
 
   
    public Pieza() {
    }


    public int getEstado_pieza() {
        return estado_pieza;
    }

    public void setEstado_pieza(int estado_pieza) {
        this.estado_pieza = estado_pieza;
    }


    public int getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(int id_pieza) {
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

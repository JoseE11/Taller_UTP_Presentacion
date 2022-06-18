/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Detalle_Trabajo {
    
  int  id_hojat_ref, id_pieza_ref, id_servicio_ref;
  String descripcion_detalle;

    public Detalle_Trabajo() {
    }

    public Detalle_Trabajo(int id_hojat_ref, int id_pieza_ref, int id_servicio_ref, String descripcion_detalle) {
        this.id_hojat_ref = id_hojat_ref;
        this.id_pieza_ref = id_pieza_ref;
        this.id_servicio_ref = id_servicio_ref;
        this.descripcion_detalle = descripcion_detalle;
    }

    public int getId_hojat_ref() {
        return id_hojat_ref;
    }

    public void setId_hojat_ref(int id_hojat_ref) {
        this.id_hojat_ref = id_hojat_ref;
    }

    public int getId_pieza_ref() {
        return id_pieza_ref;
    }

    public void setId_pieza_ref(int id_pieza_ref) {
        this.id_pieza_ref = id_pieza_ref;
    }

    public int getId_servicio_ref() {
        return id_servicio_ref;
    }

    public void setId_servicio_ref(int id_servicio_ref) {
        this.id_servicio_ref = id_servicio_ref;
    }

    public String getDescripcion_detalle() {
        return descripcion_detalle;
    }

    public void setDescripcion_detalle(String descripcion_detalle) {
        this.descripcion_detalle = descripcion_detalle;
    }
  
  
  
}

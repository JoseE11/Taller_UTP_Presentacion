/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Hoja_Presupuesto {
   int id_presupesto;
   String descripcion_presupuesto;
   boolean estado_presupuesto;
   double monto_prespuesto;

    public Hoja_Presupuesto() {
    }

    public Hoja_Presupuesto(int id_presupesto, String descripcion_presupuesto, boolean estado_presupuesto, double monto_prespuesto) {
        this.id_presupesto = id_presupesto;
        this.descripcion_presupuesto = descripcion_presupuesto;
        this.estado_presupuesto = estado_presupuesto;
        this.monto_prespuesto = monto_prespuesto;
    }

    public int getId_presupesto() {
        return id_presupesto;
    }

    public void setId_presupesto(int id_presupesto) {
        this.id_presupesto = id_presupesto;
    }

    public String getDescripcion_presupuesto() {
        return descripcion_presupuesto;
    }

    public void setDescripcion_presupuesto(String descripcion_presupuesto) {
        this.descripcion_presupuesto = descripcion_presupuesto;
    }

    public boolean isEstado_presupuesto() {
        return estado_presupuesto;
    }

    public void setEstado_presupuesto(boolean estado_presupuesto) {
        this.estado_presupuesto = estado_presupuesto;
    }

    public double getMonto_prespuesto() {
        return monto_prespuesto;
    }

    public void setMonto_prespuesto(double monto_prespuesto) {
        this.monto_prespuesto = monto_prespuesto;
    }
   
    
}

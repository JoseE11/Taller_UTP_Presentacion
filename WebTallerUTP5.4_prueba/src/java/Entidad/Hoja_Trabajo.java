/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Hoja_Trabajo {
    int id_hoja_trabajo;
    int dni_cliente_ref, dni_tecnico_ref, id_presupuesto_ref;
    double monto_total;

    public Hoja_Trabajo() {
    }

    public Hoja_Trabajo(int id_hoja_trabajo, int dni_cliente_ref, int dni_tecnico_ref, int id_presupuesto_ref, double monto_total) {
        this.id_hoja_trabajo = id_hoja_trabajo;
        this.dni_cliente_ref = dni_cliente_ref;
        this.dni_tecnico_ref = dni_tecnico_ref;
        this.id_presupuesto_ref = id_presupuesto_ref;
        this.monto_total = monto_total;
    }

    public int getId_hoja_trabajo() {
        return id_hoja_trabajo;
    }

    public void setId_hoja_trabajo(int id_hoja_trabajo) {
        this.id_hoja_trabajo = id_hoja_trabajo;
    }

    public int getDni_cliente_ref() {
        return dni_cliente_ref;
    }

    public void setDni_cliente_ref(int dni_cliente_ref) {
        this.dni_cliente_ref = dni_cliente_ref;
    }

    public int getDni_tecnico_ref() {
        return dni_tecnico_ref;
    }

    public void setDni_tecnico_ref(int dni_tecnico_ref) {
        this.dni_tecnico_ref = dni_tecnico_ref;
    }

    public int getId_presupuesto_ref() {
        return id_presupuesto_ref;
    }

    public void setId_presupuesto_ref(int id_presupuesto_ref) {
        this.id_presupuesto_ref = id_presupuesto_ref;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }
    
    
    
    
}

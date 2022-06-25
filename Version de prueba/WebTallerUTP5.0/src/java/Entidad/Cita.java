/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

public class Cita {
    int id_cita;
    int dni_tecnico;
    int dni_cliente;
    
    int estado_cita;
    String fecha_cita;
    String hora_cita;

    public Cita() {
    }

    public Cita(int id_cita, int dni_tecnico, int dni_cliente, int estado_cita, String fecha_cita, String hora_cita) {
        this.id_cita = id_cita;
        this.dni_tecnico = dni_tecnico;
        this.dni_cliente = dni_cliente;
        this.estado_cita = estado_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public int getDni_tecnico() {
        return dni_tecnico;
    }

    public void setDni_tecnico(int dni_tecnico) {
        this.dni_tecnico = dni_tecnico;
    }

    public int getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(int dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    

    public int getEstado_cita() {
        return estado_cita;
    }

    public void setEstado_cita(int estado_cita) {
        this.estado_cita = estado_cita;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }

    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

public class Usuario extends Persona {
    String contraseña, nombre_usuario;
    int rol;

    public Usuario(String contraseña, String nombre_usuario, int rol, int DNI) {
        this.contraseña = contraseña;
        this.nombre_usuario = nombre_usuario;
        this.rol = rol;
    }


        public Usuario() {
            
        }
    
}

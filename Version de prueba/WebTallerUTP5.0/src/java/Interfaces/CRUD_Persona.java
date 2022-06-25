/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidad.Persona;
import Entidad.tipo_persona;

/**
 *
 * @author Usuario
 */
public interface CRUD_Persona {
     public Persona  validar(String correo_electronico, int DNI);
     public int  login (Persona per, tipo_persona tip);
     public Persona list(int dni);
}

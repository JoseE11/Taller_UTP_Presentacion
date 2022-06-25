/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidad.Cita;
import java.util.List;


public interface CRUD_Cita {
    
    public List listar();
    public Cita list(int id_cita);
    public int add ( Cita cit);
    public int edit ( Cita cit);
    public int eliminar (int id_cita);
    
}

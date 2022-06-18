/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidad.Hoja_Presupuesto;
import java.util.List;

public interface CRUD_Presupuesto {
   
    public List listar();
    public Hoja_Presupuesto list(int id_presupesto);
    public boolean add ( Hoja_Presupuesto pres);
    public boolean edit ( Hoja_Presupuesto pres);
    public boolean eliminar (int id_presupesto); 
    
}

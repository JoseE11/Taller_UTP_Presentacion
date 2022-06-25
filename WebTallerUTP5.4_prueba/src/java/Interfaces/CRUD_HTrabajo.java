/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidad.Hoja_Trabajo;
import java.util.List;


public interface CRUD_HTrabajo {
    
    public List listar();
    public Hoja_Trabajo list(int id_hoja_trabajo);
    public boolean add ( Hoja_Trabajo hojt);
    public boolean edit ( Hoja_Trabajo hojt);
    public boolean eliminar (int id_hoja_trabajo);
}

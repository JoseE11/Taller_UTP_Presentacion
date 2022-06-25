/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidad.Pieza;
import java.util.List;

/**
 *
 * @author User
 */
public interface CRUD_Pieza {
    public List listar();
    public Pieza list(int id);
    public boolean add (Pieza pie);
    public boolean edit (Pieza pie);
    public boolean eliminar (int id);
}

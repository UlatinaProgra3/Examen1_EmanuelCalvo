/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examen1ecp.CapaDatos;

import examen1ecp.Recursos.Paciente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public interface PersonaInterface<P> {
    boolean Agregar(P obj);
    boolean Update (P obj);
    boolean add (Paciente obj);
    boolean delete (int DNIPaciente);
    DefaultTableModel ListaPaciente();
}

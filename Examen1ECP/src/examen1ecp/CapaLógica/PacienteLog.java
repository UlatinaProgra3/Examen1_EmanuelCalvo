/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1ecp.CapaLógica;

import examen1ecp.CapaDatos.PacienteDA;
import examen1ecp.Recursos.Paciente;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public class PacienteLog {
    PacienteDA P = new PacienteDA();
    public void Agregar(int DNI, String Name, String A1, String A2, String Correo, String Descripcion, int edad, int Numero, String Tipo){
        if(P.Agregar(new Paciente(Numero,Tipo,DNI,Name,A1,A2,Correo,Descripcion,edad))){
            System.out.println("Dato añadido");
        }
        else{
            System.out.println("Ha habido un error guardando este dato");
        }
        
        
    }
    public void Update(int Numero, String Tipo, int DNI, String Name, String A1, String A2, String Correo, String Descripcion, int edad){
        if(P.Update(new Paciente(Numero,Tipo,DNI,Name,A1,A2,Correo,Descripcion,edad))){
            System.out.println("Dato actualizado");
        }
        else{
            System.out.println("Ha habido un error guardando este dato");
    }
}
    public void eliminar(int DNI){
        if (P.delete(DNI)){
            System.out.println("Se ha eliminado el paciente");
        }
        else{
            System.out.println("Ha habido un error eliminando a este paciente");
        }
    }
        public DefaultTableModel list() throws SQLException{
            return P.ListaPaciente();
        
    }
    
}

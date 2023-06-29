/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1ecp;

/**
 *
 * @author emanu
 */
public class Persona {
    public int cedula;
    public String Nombre;
    public String Apellido1;
    public String A2;
    public String Correo;
    public String Descripcion;
    public int edad;

    public Persona(int cedula, String Nombre, String Apellido1, String A2, String Correo, String Descripcion, int edad) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.A2 = A2;
        this.Correo = Correo;
        this.Descripcion = Descripcion;
        this.edad = edad;
    }
    public Persona(){
        this.A2="";
        this.Apellido1 = "";
        this.Correo = "";
        this.Descripcion = "";
        this.Nombre = "";
        this.cedula = 0;
        this.edad = 0;
    }
    
}

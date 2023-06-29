/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1ecp.Recursos;

import java.util.Date;

/**
 *
 * @author emanu
 */
public class Paciente extends Persona {
    public int NumeroPaciente;
    public String tipoSangre;

    public Paciente(int cedula, String Nombre, String Apellido1, String A2, String Correo, String Descripcion, int edad) {
        super(cedula, Nombre, Apellido1, A2, Correo, Descripcion, edad);
    }

    public Paciente() {
        
    }

    public Paciente(int NumeroPaciente, String tipoSangre, int cedula, String Nombre, String Apellido1, String A2, String Correo, String Descripcion, int edad) {
        super(cedula, Nombre, Apellido1, A2, Correo, Descripcion, edad);
        this.NumeroPaciente = NumeroPaciente;
        this.tipoSangre = tipoSangre;
    }



    public int getNumeroPaciente() {
        return NumeroPaciente;
    }

    public void setNumeroPaciente(int NumeroPaciente) {
        this.NumeroPaciente = NumeroPaciente;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getA2() {
        return A2;
    }

    @Override
    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public int annoNacimiento() {
        Date t = new Date();
        int resultado = t.getYear() - this.getEdad();
        return resultado;
    }
    
}

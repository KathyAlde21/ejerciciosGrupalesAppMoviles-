

package clases14grupal;
/**
    *
    * @author Katherine Alderete
    * @author Soraya Tapia
    * @author Daniela Puebla
    * @version 0.0.1
    */

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

 
public class Usuario {
        public String nombre;
	public Date fechaDeNacimiento;
	public String Rut;

    public Usuario() {
    }

    public Usuario(String nombre, Date fechaDeNacimiento, String Rut) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.Rut = Rut;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", Rut=" + Rut + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }
    public String mostrarEdad() {
        LocalDate fechaNacimiento = fechaDeNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        return "El usuario tiene " + edad.getYears() + " años";
    }
    
}

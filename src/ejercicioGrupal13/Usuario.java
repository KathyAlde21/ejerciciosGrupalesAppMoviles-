package grupal13;
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

}

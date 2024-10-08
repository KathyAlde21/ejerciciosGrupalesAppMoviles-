package grupal13;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
Daniela Puebla
Juan Diego Pardo
Katherine Alderete
Soraya Tapia 
*/

public class Main {
    
 public static void main(String[] args) {
        // Crear instancia de Cliente
        Cliente cliente = new Cliente(12345678, "Juan", "Perez", "123456789", "AFP Modelo", 1, "Calle Falsa 123", "Santiago", 30);
        System.out.println(cliente); 
        
        // Crear instancia de Usuario
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = sdf.parse("01/01/1990");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Usuario usuario = new Usuario("Pedro", fechaNacimiento, "12345678-9");
        System.out.println(usuario);

        // Crear instancia de Capacitacion
        Capacitacion capacitacion = new Capacitacion(1, 12345678, "Lunes", "10:00", "Sala 1", 2, 20);
        System.out.println(capacitacion);
    }
}

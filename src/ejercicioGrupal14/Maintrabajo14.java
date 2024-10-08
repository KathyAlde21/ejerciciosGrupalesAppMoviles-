package clases14grupal;
/**
    *
    * @author Katherine Alderete
    * @author Soraya Tapia
    * @author Daniela Puebla
    * @version 0.0.1
    */

import java.util.Date;


public class Maintrabajo14 {

   
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Soraya Tapia", new Date(87,05,13), "45678-9");
        Usuario usuario2 = new Usuario();
        
        
        //modificar
        usuario2.setNombre("Maria Perez");
        usuario2.setFechaDeNacimiento(new Date(60,04,30));
        usuario2.setRut("12256-1");
        System.out.println();

        //  muestra datos con toString
        System.out.println("Datos de usuario1:");
        System.out.println(usuario1.toString());
        System.out.println();
        System.out.println("Datos de usuario2:");
        System.out.println(usuario2.toString());
        System.out.println();



        System.out.println("Datos actualizados de usuario1:");
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Fecha de Nacimiento: " + usuario1.getFechaDeNacimiento());
        System.out.println("RUT: " + usuario1.getRut());
        System.out.println(usuario1.mostrarEdad());
        System.out.println();

        System.out.println("Datos actualizados de usuario2:");
        System.out.println("Nombre: " + usuario2.getNombre());
        System.out.println("Fecha de Nacimiento: " + usuario2.getFechaDeNacimiento());
        System.out.println("RUT: " + usuario2.getRut());
        System.out.println(usuario2.mostrarEdad());
       System.out.println();
       
       /// cliente 
       Cliente cliente1 = new Cliente();
       Cliente cliente3 = new Cliente(12345-8, "Juan", "Roman", "9586", "AFP Provida", 1, " Libertador 123", "Santiago", 35);
       System.out.println();
       
        System.out.println("Datos actualizados de clientes");
        cliente1.setRut(8765432-1);
        cliente3.setNombres("Gabriela");
        cliente1.setAFP("Capital");
        cliente3.setSistemaDeSalud(Cliente.ISAPRE);
        cliente3.obtenerNombreCompleto();
        System.out.println();
        
        
        //muestra de datos de cliente
        System.out.println("Cliente 1:");
        System.out.println("RUT: " + cliente3.getRut());
        System.out.println("Nombres: " + cliente3.getNombres());
        System.out.println("Apellidos: " + cliente3.getApellidos());
        System.out.println("Telefono: " + cliente1.getTelefono());
        System.out.println("AFP: " + cliente1.getAFP());
        System.out.println("Sistema de Salud: " + cliente3.getSistemaDeSalud());
        System.out.println("Direccion: " + cliente3.getDireccion());
        System.out.println("Comuna: " + cliente3.getComuna());
        System.out.println("Edad: " + cliente3.getEdad());
        System.out.println();
        
        
        // Capacitación
        Capacitacion capacitacion1 = new Capacitacion(12345, 12345678, "Martes 20-05", "10 horas", "Sala A", 600, 25);
        Capacitacion capacitacion2 = new Capacitacion(12346, 98765432, "Miércoles 21-05", "5 horas", "Sala B", 300, 20);
        System.out.println();

        System.out.println("Capacitacion 1:");
        System.out.println(capacitacion1);
        System.out.println("Capacitacion 2:");
        System.out.println(capacitacion2);
        System.out.println();

        System.out.println("Datos actualizados de Capacitacion 2");
        capacitacion2.setDiaCapacitacion("2024-08-01");
        capacitacion2.setHoraCapacitacion("1 pm");
        System.out.println(capacitacion2.mostrarDetalle());
        System.out.println();
    }
        
}
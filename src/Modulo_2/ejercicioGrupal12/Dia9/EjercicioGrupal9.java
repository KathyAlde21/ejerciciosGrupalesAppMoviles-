package Modulo_2.ejercicioGrupal12.Dia9;

import java.util.Scanner;

/*
* Katherine Alderete
* Soraya Tapia
* Daniela Puebla
* Juan Diego Pardo
*/
public class EjercicioGrupal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
               
        // Datos del cliente
        System.out.println("Registro de Empresa Cliente:");
        System.out.print("RUT: ");
        String rutEmpresaCli = scanner.nextLine();
        System.out.print("Nombre Empresa: ");
        String nombreEmpresaCli = scanner.nextLine();
        System.out.print("Direccion Empresa: ");
        String direccionEmpresaCli = scanner.nextLine();
        System.out.print("Comuna: ");
        String comunaEmpresaCli = scanner.nextLine();
        System.out.print("Número de Telefono: ");
        String telefonoEmpresaCli = scanner.nextLine();
        
        // Datos de la capacitación
        System.out.println("\nRegistro de Capacitacion:");
        System.out.print("Dia: ");
        String diaCapacitacion = scanner.nextLine();
        System.out.print("Hora: ");
        String horaCapacitacion = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugarCapacitacion = scanner.nextLine();
        System.out.print("Duracion (en horas): ");
        int duracionCapacitacion = scanner.nextInt();
        System.out.print("Cantidad de Asistentes: ");
        int cantidadAsistentes = scanner.nextInt();
        
        // Validar cantidad de asistentes
        while (cantidadAsistentes <= 0) {
            System.out.print("La cantidad de asistentes debe ser mayor a cero. Intente nuevamente: ");
            cantidadAsistentes = scanner.nextInt();
        }
        
        // Información de los asistentes
        String[] nombresAsistentes = new String[cantidadAsistentes];
        int[] edadesAsistentes = new int[cantidadAsistentes];
        scanner.nextLine(); // Limpiar buffer
        
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("\nRegistro de Asistente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombresAsistentes[i] = scanner.nextLine();
            System.out.print("Edad: ");
            edadesAsistentes[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
        }
        
        // Contar asistentes por rango de edad
        int menores25 = 0;
        int entre26y35 = 0;
        int mayores35 = 0;
        
        for (int edad : edadesAsistentes) {
            if (edad < 25) {
                menores25++;
            } else if (edad <= 35) {
                entre26y35++;
            } else {
                mayores35++;
            }
        }
        
        // Mostrar datos por pantalla
        System.out.println("\nDatos del Cliente:");
        System.out.println("RUT: " + rutEmpresaCli);
        System.out.println("Nombre: " + nombreEmpresaCli);
        System.out.println("Direccion: " + direccionEmpresaCli);
        System.out.println("Comuna: " + comunaEmpresaCli);
        System.out.println("Telefono: " + telefonoEmpresaCli);
        
        System.out.println("\nDatos de la Capacitacion:");
        System.out.println("Dia: " + diaCapacitacion);
        System.out.println("Hora: " + horaCapacitacion);
        System.out.println("Lugar: " + lugarCapacitacion);
        System.out.println("Duracion: " + duracionCapacitacion + " horas");
        System.out.println("Cantidad de Asistentes: " + cantidadAsistentes);
        
        System.out.println("\nAsistentes por rango de edad:");
        System.out.println("Menores de 25 años: " + menores25);
        System.out.println("Entre 26 y 35 años: " + entre26y35);
        System.out.println("Mayores de 35 años: " + mayores35);
        
        scanner.close();
     
    }
}

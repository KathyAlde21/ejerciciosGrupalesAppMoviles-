package Modulo_2.ejercicioGrupal12.Dia10;

import java.util.Scanner;
/*
* Katherine Alderete
* Soraya Tapia
* Daniela Puebla
* Juan Diego Pardo
*/
public class EjercioGrupal10 {
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
        System.out.print("Numero de Telefono: ");
        String telefonoEmpresaCli = scanner.nextLine();
        
        // Datos de la capacitacion
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
        
        // Informacion de los asistentes
        String[][] asistentes = new String[cantidadAsistentes][2];
        scanner.nextLine(); // Limpiar buffer
        
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("\nRegistro de Asistente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            asistentes[i][0] = scanner.nextLine();
            System.out.print("Calificacion (entre 1 y 7): ");
            int calificacion = scanner.nextInt();
            
            // Validar calificacion
            while (calificacion < 1 || calificacion > 7) {
                System.out.print("La calificacion debe ser un valor entero entre 1 y 7. Intente nuevamente: ");
                calificacion = scanner.nextInt();
            }
            
            asistentes[i][1] = Integer.toString(calificacion);
            scanner.nextLine(); // Limpiar buffer
        }
        
        // Calcular promedio, calificacion mayor y menor
        int sumaCalificaciones = 0;
        int notaAltaque = 1;
        int notaBajaque = 7;
        
        for (int i = 0; i < cantidadAsistentes; i++) {
            int calificacion = Integer.parseInt(asistentes[i][1]);
            sumaCalificaciones += calificacion;
            if (calificacion > notaAltaque) {
                notaAltaque= calificacion;
            }
            if (calificacion < notaBajaque) {
                notaBajaque = calificacion;
            }
        }
        
        double promedioCalificaciones = (double) sumaCalificaciones / cantidadAsistentes;
        
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
        
        System.out.println("\nCalificaciones de los Asistentes:");
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("Nombre: " + asistentes[i][0] + ", Calificacion: " + asistentes[i][1]);
        }
        
        System.out.println("\nEstadisticas de Calificaciones:");
        System.out.printf("Promedio de Calificaciones: %.2f%n", promedioCalificaciones);
        System.out.println("Calificacion mas baja es: " + notaBajaque);
        System.out.println("Calificacion mas alta es : " + notaAltaque);
        
        scanner.close();
    
    }
}

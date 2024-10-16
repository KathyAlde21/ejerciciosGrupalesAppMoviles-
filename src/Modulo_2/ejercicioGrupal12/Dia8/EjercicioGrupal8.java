package Modulo_2.ejercicioGrupal12.Dia8;

import java.util.Scanner;

/*
* Katherine Alderete
* Soraya Tapia
* Daniela Puebla
* Juan Diego Pardo
*/
public class EjercicioGrupal8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       //inicia el registro de usuarios
        System.out.println("Registro de Usuario");
        System.out.print("Nombre: ");//guarda el nombre
        String nombre = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = scanner.nextLine();// guarda la fecha de nacimento
        System.out.print("RUT: ");
        String rut = scanner.nextLine();//guarda el Rut

       //clasificacion de tipo usuario
        System.out.println("\nSeleccione el perfil a registrar:");
        System.out.println("1. Cliente");
        System.out.println("2. Profesional");
        System.out.println("3. Administrativo");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();// lee la opcion de tipo usuario
        
       //se llenaran los campos seguntipo de usurio
        
      switch (opcion)  {
            case 1 -> {
                System.out.print("Direccion: ");
                String direccionCliente = scanner.nextLine();//guarda la direccion
                scanner.nextLine();
                System.out.print("Telefono: ");
                String telefonoCliente = scanner.nextLine();//guarda el telefono
                System.out.print("Cantidad de empleados: ");
                int cantidadEmpleados = scanner.nextInt();// guarda la cantidad de empleados
                scanner.nextLine();
                System.out.println("\nDatos del Cliente:");// imprime datos ingresados
                System.out.println("Nombre: " + nombre);// imprime nombre
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);// imprime fechade nacimento
                System.out.println("RUT: " + rut);// imprime rut
                System.out.println("Direccion: " + direccionCliente);// imprime direccion
                System.out.println("Telefono: " + telefonoCliente);// imprime telefono
                System.out.println("Cantidad de empleados: " + cantidadEmpleados);// imprime cantidad de empleados
        }
                
            case 2 -> {
                System.out.print("Anios de experiencia: ");
                int experiencia = scanner.nextInt();//guarda años de experiencia
                scanner.nextLine();
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();//guarda el departamento de trabajo
                System.out.println("\nDatos del Profesional:");// imprime datos ingresados
                System.out.println("Nombre: " + nombre);// imprime nombre
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);// imprime fechade nacimento
                System.out.println("RUT: " + rut);// imprime rut
                System.out.println("Anios de experiencia: " + experiencia);//imprime años de experiencia
                System.out.println("Departamento: " + departamento);// imprime el departamento de trabajo
        }

              
            case 3 -> {
                System.out.print("Funcion: ");
                String funcion = scanner.nextLine();//guarda la funcion
                scanner.nextLine();
                System.out.print("Nombre del superior: ");
                String nombreSuperior = scanner.nextLine();//guarda el nombre del superior
                System.out.println("\nDatos del Administrativo:");// imprime datos ingresados
                System.out.println("Nombre: " + nombre);// imprime nombre
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);// imprime fechade nacimento
                System.out.println("RUT: " + rut);// imprime rut
                System.out.println("Funcion: " + funcion);//imprime la funcion
                System.out.println("Nombre del superior: " + nombreSuperior);//imprime el nombre del superior
        }

                default -> {
                    System.out.println("Opcion no valida");//sino indica que op no es valida
                }
            }
      }
}  
    


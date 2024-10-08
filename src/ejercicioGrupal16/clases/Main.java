package clases;

public class Main {
public static void main(String[] args) {
	Listas listado = new Listas();
	Cliente Cliente1 = new Cliente("Andrea","13-05-89","123456897","Tapia","58752377","Habitad",2,"Baquedano 20","Lampa","35");
	listado.agregarUsuario(Cliente1);
	
	Profesional profesional1 = new Profesional("Jaime","20-03-2015","156355687","17-08-2022","Robotica");
	listado.agregarUsuario(profesional1);
	
	Administrativo administrativo1 = new Administrativo("Victoria","05-08-1960","207896352","Robotica","TI");
	listado.agregarUsuario(administrativo1);
	
	listado.analizarUsuario();
}
}

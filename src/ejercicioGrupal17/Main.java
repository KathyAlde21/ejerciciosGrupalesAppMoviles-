package ejercicioGrupal17;

public class Main {
    public static void main(String[] args) {
    
	Listas listado = new Listas();
        
//--------------------------------------------------------
        
	Cliente cliente1 = new Cliente(
                "Andrea",
                "13-05-89",
                "123456897",
                "Tapia",
                "58752377",
                "Habitad",
                2,
                "Baquedano 20",
                "Lampa",
                "35");
        
	listado.agregarUsuario(cliente1);
        System.out.println(cliente1);
        
//--------------------------------------------------------	

	Profesional profesional1 = new Profesional(
                "Jaime",
                "20-03-2015",
                "156355687",
                "17-08-2022",
                "Robotica");
        
	listado.agregarUsuario(profesional1);
        System.out.println(profesional1);
	
//--------------------------------------------------------

	Administrativo administrativo1 = new Administrativo(
                "Victoria",
                "05-08-1960",
                "207896352",
                "Robotica",
                "TI");
        
	listado.agregarUsuario(administrativo1);
        System.out.println(administrativo1);
	
//--------------------------------------------------------
        
     //   AnalizadorUsuarios analizar = new AnalizadorUsuarios();
        
        //analizar.analizarUsuario();
	//listado.analizarUsuario();
        
   
    }
}

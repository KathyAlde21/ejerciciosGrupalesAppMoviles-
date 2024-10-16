package Modulo_2.ejercicioGrupal17;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    
	private List<Asesoria> usuarios; 
        // Dependencia de abstracción, no de clases concretas
       
        
        public Listas() {
            this.usuarios = new ArrayList<>();
	}
        
        //-------------------
        
	public void agregarUsuario(Asesoria usuario){
            usuarios.add(usuario);
	}
        
        /* => ahora independiente como mejora
        public void analizarUsuario() {
		for (Asesoria usuario:usuarios){
		usuario.analizarUsuario();
            }
        } */
        
    
    @Override
    public String toString() {
        return "Listas{" + "usuarios=" + usuarios + '}';
    }

     
}



package clases;
import java.util.ArrayList;
import java.util.List;

public class Listas {
	private List<Asesoria> usuarios;

	public Listas() {
		this.usuarios = new ArrayList<>();
	}	
	public void agregarUsuario(Asesoria usuario){
	usuarios.add(usuario);
	}	
	public void analizarUsuario() {
		for (Asesoria usuario:usuarios){
		usuario.analizarUsuario();
	}
		}
	}



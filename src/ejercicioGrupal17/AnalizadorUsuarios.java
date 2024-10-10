package ejercicioGrupal17;

import java.util.List;

public class AnalizadorUsuarios {
    
    private List<Asesoria> usuarios;
    
    public void analizarUsuarios(List<Asesoria> usuarios){
        for (Asesoria usuario : usuarios){
            usuario.analizarUsuario();            
        }
    }   

     
    public AnalizadorUsuarios(List<Asesoria> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Asesoria> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Asesoria> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "AnalizadorUsuarios{" + "usuarios=" + usuarios + '}';
    }



}

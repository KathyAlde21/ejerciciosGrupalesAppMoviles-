package ejercicioGrupal17;

public class Profesional extends Usuario {
    
	private String titulo;
	private String fechaIngreso;
        
        public Profesional (){};
	
	public Profesional(
                String nombre,
                String fechaDeNacimiento,
                String rut,
                String fechaIngreso,
                String titulo
        ) {
		super(nombre, fechaDeNacimiento, rut);
		this.fechaIngreso = fechaIngreso;
		this.titulo= titulo;	
	}
	
        //-----------------------------------
        
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

        //****************************
	
        @Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("titulo:" + titulo);
		System.out.println("fechaIngreso:" + fechaIngreso);
	}

    @Override
    public String toString() {
        return "Profesional{" + "titulo=" + titulo
                + ", fechaIngreso=" + fechaIngreso
                + '}'
                + super.toString();
    }
        
	
}

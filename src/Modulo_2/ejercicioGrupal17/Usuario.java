package Modulo_2.ejercicioGrupal17;

public abstract class Usuario implements Asesoria{
    //Principio Abierto/Cerrado (OCP): la clase Usuario se puede extender
    //y añadir nuevas funcionalidades sin modificarlo
    
	protected String nombre;
	protected String fechaDeNacimiento;
	protected String Rut;
	
        public Usuario (){};

        public Usuario(
                String nombre,
                String fechaDeNacimiento,
                String Rut
        ) {
            this.nombre = nombre;
            this.fechaDeNacimiento = fechaDeNacimiento;
            this.Rut = Rut;
        }
	
        //-----------------------
        
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}
        
        //*****************************

	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de usuario: " + nombre);	
	}

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre
                + ", fechaDeNacimiento=" + fechaDeNacimiento
                + ", Rut=" + Rut
                + '}'
                + super.toString();
    }
	
}

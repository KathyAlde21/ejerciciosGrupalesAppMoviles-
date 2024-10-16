package Modulo_2.ejercicioGrupal16.clases;

public abstract class Usuario implements Asesoria{
	protected String nombre;
	protected String fechaDeNacimiento;
	protected String Rut;
	
	public Usuario(String nombre, String fechaDeNacimiento, String rut) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.Rut = rut;
	}

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

	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de usuario: " + nombre);
		
	}

	
	
}

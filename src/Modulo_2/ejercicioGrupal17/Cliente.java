package Modulo_2.ejercicioGrupal17;

public class Cliente extends Usuario {
    // Principio de Responsabilidad Única (SRP): la clase gestiona datos
    //propios de un Cliente y hereda comportamientos generales de Usuario   
    
	private String apellido;
	private String telefono;
	private String AFP;
	private int sistemaDeSalud;
	private String direccion;
	private String comuna;
	private String edad;
	
        // ---------------------------
        
	public Cliente (){};	
	
	public Cliente(
                String nombre,
                String fechaDeNacimiento,
                String rut,
                String apellido,
                String telefono,
                String aFP,
		int sistemaDeSalud,
                String direccion,
                String comuna,
                String edad
        ) {
		super(nombre, fechaDeNacimiento, rut);
		this.apellido = apellido;
		this.telefono = telefono;
		this.AFP = aFP;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	//-------------------------------
	
	public String obtenerSistemaSalud() {
		return this.sistemaDeSalud ==1 ? "Fonasa" : "Isapre";
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAFP() {
		return AFP;
	}

	public void setAFP(String aFP) {
		AFP = aFP;
	}

	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}

	public void setSistemaDeSalud(int sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

        //------------------------------------
        
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
	}

    @Override
    public String toString() {
        return "Cliente{" + "apellido=" + apellido
                + ", telefono=" + telefono
                + ", AFP=" + AFP 
                + ", sistemaDeSalud=" + sistemaDeSalud 
                + ", direccion=" + direccion 
                + ", comuna=" + comuna 
                + ", edad=" + edad 
                + '}'
                + super.toString();
    }

}

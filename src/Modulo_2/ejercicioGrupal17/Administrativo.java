package Modulo_2.ejercicioGrupal17;

public class Administrativo extends Usuario {
	
    private String area;
	private String experienciaPrevia;
        
        public Administrativo(){};
        
	public Administrativo(
                String nombre,
                String fechaDeNacimiento,
                String rut,
                String experienciaPrevia,
                String area
        ) {
		super(nombre, fechaDeNacimiento, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
        
        
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	

    @Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("area:" + area);
		System.out.println("experienciaPrevia:" + experienciaPrevia);
	}


    @Override
    public String toString() {
        return "Administrativo{" + "area=" + area
                + ", experienciaPrevia=" + experienciaPrevia
                + '}'
                + super.toString();
    }
	
}

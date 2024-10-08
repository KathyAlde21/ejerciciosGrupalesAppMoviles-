
package clases14grupal;

/**
    *
    * @author Katherine Alderete
    * @author Soraya Tapia
    * @author Daniela Puebla
    * @version 0.0.1
    */


public class Cliente {
     private Integer rut;
    private String nombres;
    private String apellidos;
    public String telefono;
    public String AFP;
    public int sistemaDeSalud;
    public String direccion;
    public String comuna;
    public int edad;
    
    public static final int FONASA = 1;
    public static final int ISAPRE = 2;

    
    
    
    
    public Cliente() {
    }

    public Cliente(Integer rut, String nombres, String apellido, String telefono, String AFP, int sistemaDeSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellido;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaDeSalud = sistemaDeSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + 
                ", nombres=" + nombres + 
                ", apellido=" + apellidos + 
                ", telefono=" + telefono + 
                ", AFP=" + AFP + 
                ", sistemaDeSalud=" + sistemaDeSalud + 
                ", direccion=" + direccion + 
                ", comuna=" + comuna + 
                ", edad=" + edad + '}';
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        if (rut != null && rut > 0 && rut < 99999999) {
            this.rut = rut;
        } else {
            throw new IllegalArgumentException("El RUT debe ser igual o menor que 99.999.999.");
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
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

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public int getSistemaDeSalud() {
        return sistemaDeSalud;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodos
    public void setSistemaDeSalud(int sistemaDeSalud) {
        if (sistemaDeSalud == FONASA || sistemaDeSalud == ISAPRE) {
            this.sistemaDeSalud = sistemaDeSalud;
        } else {
            throw new IllegalArgumentException("Sistema de salud no valido.");
        }
    }

    public String obtenerNombreCompleto() {
        return nombres + " " + apellidos;
    }

			
		
    }
      
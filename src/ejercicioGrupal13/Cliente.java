package grupal13;

public class Cliente {
    public Integer rut;
    public String nombres;
    public String apellido;
    public String telefono;
    public String AFP;
    public int sistemaDeSalud;
    public String direccion;
    public String comuna;
    public int edad;

    public Cliente() {
    }

    public Cliente(int rut, String nombres, String apellido, String telefono, String AFP, int sistemaDeSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellido = apellido;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaDeSalud = sistemaDeSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

  

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombres=" + nombres + ", apellido=" + apellido + ", telefono=" + telefono + ", AFP=" + AFP + ", sistemaDeSalud=" + sistemaDeSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + '}';
    }
    
}

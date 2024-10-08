package grupal13;


public class Capacitacion {
           
        public int codcapacitacion;
        public Integer RutCapacitacion;
        public String diaCapacitacion;
	public String horaCapacitacion;
	public String lugarCapacitacion;
        public int duracionCapacitacion;
        public int cantidadAsistentes;

    public Capacitacion() {
    }


    public Capacitacion(int codcapacitacion, Integer RutCapacitacion, String diaCapacitacion, String horaCapacitacion, String lugarCapacitacion, int duracionCapacitacion, int cantidadAsistentes) {
        this.codcapacitacion = codcapacitacion;
        this.RutCapacitacion = RutCapacitacion;
        this.diaCapacitacion = diaCapacitacion;
        this.horaCapacitacion = horaCapacitacion;
        this.lugarCapacitacion = lugarCapacitacion;
        this.duracionCapacitacion = duracionCapacitacion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    

    @Override
    public String toString() {
        return "Capacitacion{" + "codcapacitacion=" + codcapacitacion + ", RutCapacitacion=" + RutCapacitacion + ", diaCapacitacion=" + diaCapacitacion + ", horaCapacitacion=" + horaCapacitacion + ", lugarCapacitacion=" + lugarCapacitacion + ", duracionCapacitacion=" + duracionCapacitacion + ", cantidadAsistentes=" + cantidadAsistentes + '}';
    }

         
}

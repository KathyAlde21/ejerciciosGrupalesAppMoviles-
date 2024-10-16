

package Modulo_2.ejercicioGrupal14;
/**
    *
    * @author Katherine Alderete
    * @author Soraya Tapia
    * @author Daniela Puebla
    * @version 0.0.1
    */
public class Capacitacion {
        private int codcapacitacion;
    private Integer RutCapacitacion;
    private String diaCapacitacion;
    private String horaCapacitacion;
    private String lugarCapacitacion;
    private int duracionCapacitacion;
    private int cantidadAsistentes;

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
        return "Capacitacion{" +
                "codcapacitacion=" + codcapacitacion +
                ", RutCapacitacion=" + RutCapacitacion +
                ", diaCapacitacion='" + diaCapacitacion + '\'' +
                ", horaCapacitacion='" + horaCapacitacion + '\'' +
                ", lugarCapacitacion='" + lugarCapacitacion + '\'' +
                ", duracionCapacitacion=" + duracionCapacitacion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }

    public int getCodcapacitacion() {
        return codcapacitacion;
    }

    public void setCodcapacitacion(int codcapacitacion) {
        this.codcapacitacion = codcapacitacion;
    }

    public Integer getRutCapacitacion() {
        return RutCapacitacion;
    }

    public void setRutCapacitacion(Integer RutCapacitacion) {
        this.RutCapacitacion = RutCapacitacion;
    }

    public String getDiaCapacitacion() {
        return diaCapacitacion;
    }

    public void setDiaCapacitacion(String diaCapacitacion) {
        this.diaCapacitacion = diaCapacitacion;
    }

    public String getHoraCapacitacion() {
        return horaCapacitacion;
    }

    public void setHoraCapacitacion(String horaCapacitacion) {
        this.horaCapacitacion = horaCapacitacion;
    }

    public String getLugarCapacitacion() {
        return lugarCapacitacion;
    }

    public void setLugarCapacitacion(String lugarCapacitacion) {
        this.lugarCapacitacion = lugarCapacitacion;
    }

    public int getDuracionCapacitacion() {
        return duracionCapacitacion;
    }

    public void setDuracionCapacitacion(int duracionCapacitacion) {
        this.duracionCapacitacion = duracionCapacitacion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public String mostrarDetalle() {
        return String.format("La capacitacion sera en %s  comienza a la(s) %s del dia %s, y su duraricion sera de  %d minutos.",
                lugarCapacitacion, horaCapacitacion, diaCapacitacion, duracionCapacitacion);
    }
} 


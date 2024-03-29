package citas2902082.java.entities;

import citas2902082.java.entities.enums.Especialidad;
import citas2902082.java.entities.enums.TipoIdentificacion;

public class Medico {
    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificacion;
    public Integer registroMedico;
    public Especialidad especialidad;
    public Medico(String nombres,
            String apellidos,
            TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion,
            Integer registroMedico,
            Especialidad especialidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

}

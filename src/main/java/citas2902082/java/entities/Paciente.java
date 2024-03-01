package citas2902082.java.entities;

import java.time.LocalDateTime;
import citas2902082.java.entities.enums.TipoIdentificacion;
import citas2902082.java.entities.enums.TipoSangre;

public class Paciente {

    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentificacion; 
    public TipoSangre tipoSangre;
    public Double peso;
    public Double altura;
    public LocalDateTime fechaNacimiento;
    public String email;
    public char factorRH;
    
    public Paciente(String nombres,
            String apellidos,
            TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion,
            TipoSangre tipoSangre,
            Double peso,
            Double altura,
            LocalDateTime fechaNacimiento,
            String email,
            char factorRH) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoSangre = tipoSangre;
        this.peso = peso;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.factorRH = factorRH;
    }

}

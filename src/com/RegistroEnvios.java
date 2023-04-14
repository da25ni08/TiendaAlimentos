/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com;

import com.clasesDatos.*;
import java.time.LocalDate;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public class RegistroEnvios extends CestaPersonal{

    private String direccion, dniPropietario;
    private LocalDate fechaSolicitud;

    public RegistroEnvios(String direccion, String dniPropietario, LocalDate fechaSolicitud) {
        this.direccion = direccion;
        this.dniPropietario = dniPropietario;
        this.fechaSolicitud = fechaSolicitud;
    }

    

    public String getDireccion() {
        return direccion;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    
    
    
}

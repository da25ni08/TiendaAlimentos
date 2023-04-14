/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com.clasesDatos;


/**
 * @author Daniel Delgado Pérez TODO description
 */
public class Articulos {
    
    private Alimento Alimento;
    private int cantidad;

    public Articulos(Alimento Alimento, int cantidad) {
        this.Alimento = Alimento;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Alimento getAlimento() {
        return Alimento;
    }

    public void cambiarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    
}

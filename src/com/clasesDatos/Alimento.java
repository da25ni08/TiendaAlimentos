/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com.clasesDatos;

import java.time.LocalDate;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public class Alimento {

    private String nombre, marca;
    private TipoAlimento tipo;
    private float precioUnidad;
    private LocalDate fechaCaducidad;
    private int descuento;

    public enum TipoAlimento {
        BEBIDA, CONJELADO, EMBUTIDO, BOLLERIA, CONSERV, OTROS
    }

    public Alimento(String nombre, String marca, TipoAlimento tipo, float precioUnidad, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioUnidad = precioUnidad;
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = 0;
    }

    public Alimento(String nombre, String marca, TipoAlimento tipo, float precioUnidad, LocalDate fechaCaducidad, int descuento) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioUnidad = precioUnidad;
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public float getPrecioDescontado() {
        return (this.precioUnidad * descuento) / 100;
    }

}

/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */

package com;

import com.clasesDatos.Alimento;
import java.time.LocalDate;

/**
 * @author Daniel Delgado Pérez 
 * TODO description
 */
public final class InterfazComandos {

    private InterfazComandos() {
    }
    
    public static void añadirProducto(Almacen almacen) {
        String nombre, marca;
        Alimento.TipoAlimento tipo;
        LocalDate fecha = null;
        int descuento, cantidad;
        //TODO pedir todos los parametros 
        if (fecha == null) {
            Alimento producto = new Alimento(nombre, marca, tipo, precioUnidad, descuento);
        }else {
            Alimento producto = new Alimento(nombre, marca, tipo, precioUnidad, fecha, descuento);
        }
        //TODO pedir cantidad alimentos
        almacen.insertarAlimento(producto, cantidad);
    }
    
    
}

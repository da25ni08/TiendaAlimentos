/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com.comparadores;

import com.clasesDatos.Alimento;
import java.util.Comparator;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public class ComparadorNombre implements Comparator<Alimento> {
    
    @Override
    public int compare(Alimento alimento1, Alimento alimento2) {
        return alimento1.getNombre().compareTo(alimento2.getNombre());

    }
}

/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com.comparadores;

import com.clasesDatos.Articulos;
import java.util.Comparator;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public class ComparadorCesta implements Comparator<Articulos> {

    @Override
    public int compare(Articulos art1, Articulos art2) {
        return art1.getAlimento().getNombre().compareTo(art2.getAlimento().getNombre());
    }
}

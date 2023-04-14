/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com;

import com.clasesDatos.Alimento;
import com.clasesDatos.Articulos;
import java.util.ArrayList;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public class CestaPersonal {

    private ArrayList<Articulos> cesta;

    public CestaPersonal() {
        cesta = new ArrayList();
    }
    
    /**
     * Obtiene el articulo en funcion del nombre
     * @param nombre 
     * @return 
     * @throws IllegalArgumentException 
     */

    public Articulos getArticulos(String nombre) throws IllegalArgumentException {
        for (Articulos articulo : cesta) {
            if (nombre.equals(articulo.getAlimento().getNombre())) {
                return articulo;
            }
        }
        throw new IllegalArgumentException("No se encuentra en la cesta");
    }
    

    public void insertarArticulo(Articulos articulo) {
        if (cesta.contains(articulo)) {
            cesta.add(articulo);
        }
        throw new IllegalArgumentException("Articulo ya existente en el carrito");
    }

    /**
     * Modifica la cantidad del articulo y en caso de quedar cantidad 0 elimina el objeto de la cesta
     * @param alimento Alimento a eliminar
     * @param cantidad cantidad a modificar, siendo negativo si se va a eliminar
     * @return Devuelve un booleano dependiendo si el alimento se ha eliminado
     * de la cesta o solo se ha reducido su cantidad, siendo true que se ha
     * eliminado
     * @throws IllegalArgumentException
     */
    public boolean modificarArticulo(Alimento alimento, int cantidad) throws IllegalArgumentException {

        try {
            int posicionArticulo = cesta.indexOf(getArticulos(alimento.getNombre()));
            cesta.get(posicionArticulo).cambiarCantidad(cantidad);
            if (cesta.get(posicionArticulo).getCantidad() <= 0) {
                cesta.remove(posicionArticulo);
                return true;
            }
        } catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
}

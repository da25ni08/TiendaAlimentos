/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com;

import com.clasesDatos.Alimento;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public class CestaPersonal {

    private LinkedList<Alimento> articulosCesta;
    private HashMap<String, Integer> cantidadesCesta;

    public CestaPersonal() {
        articulosCesta = new LinkedList();
        cantidadesCesta = new HashMap<>();
    }
    
    /**
     * Obtiene el articulo en funcion del nombre
     * @param nombre 
     * @return 
     * @throws IllegalArgumentException 
     */

    public Alimento getArticulos(String nombre) throws IllegalArgumentException {
        Iterator<Alimento> it = articulosCesta.iterator();
        while(it.hasNext()) {
            Alimento alimentoUsado = it.next();
            if(alimentoUsado.getNombre().equals(nombre)) {
                return alimentoUsado;
            }
        }
        throw new IllegalArgumentException("No se encuentra en la cesta");
    }
    

    public void insertarArticulo(Alimento alimento, int cantidad) {
        if (articulosCesta.contains(alimento)) {
            articulosCesta.addLast(alimento);
            cantidadesCesta.put(alimento.getNombre(), cantidad);
        }
        throw new IllegalArgumentException("Articulo ya existente en el carrito");
    }
    
    public void modificarCantidad(String nombre, int nuevaCantidad) throws IllegalArgumentException {
        if(cantidadesCesta.replace(nombre, nuevaCantidad) == null) {
            throw new IllegalArgumentException("Alimento no existente");
        }
    }
    
    public float precioTotal() {
        float total = 0;
        Iterator<Alimento> it = articulosCesta.iterator();
        while(it.hasNext()) {
            
        }
        return total;
    }
}

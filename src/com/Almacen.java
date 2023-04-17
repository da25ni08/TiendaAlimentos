/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */

package com;

import com.clasesDatos.Alimento;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Daniel Delgado Pérez 
 * TODO description
 */
public class Almacen {
    private static HashMap<String, Integer> contenidoAlmacen = new HashMap<String,Integer>();
    private static ArrayList<Alimento> alimentos = new ArrayList<Alimento>();

    public Almacen() {
    }
    
    public static void insertarAlimento(Alimento alimento, int cantidad) throws IllegalArgumentException {
        if (contenidoAlmacen.containsKey(alimento.getNombre())) {
            throw new IllegalArgumentException("Articulo existente");
        }
        alimentos.add(alimento);
        contenidoAlmacen.put(alimento.getNombre(), cantidad);
    }
    
    public static int getPrecio(String nombre) {
        return contenidoAlmacen.get(nombre);
    }
    
    public static Alimento getAlimento (String nombre) throws IllegalArgumentException{
        for(Alimento alimento : alimentos) {
            if (alimento.getNombre().equals(nombre)) {
                return alimento;
            }
        } 
        throw new IllegalArgumentException("Alimento no en stock");
    }
    
    
}

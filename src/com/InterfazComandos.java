/*
 *  @author Daniel Delgado Pérez 
 *  @see Github: da25ni08
 *  @see danidp25.08@gmail.com
 */
package com;

import com.clasesDatos.Alimento;
import java.time.LocalDate;
import static com.Almacen.*;
import java.util.Scanner;

/**
 * @author Daniel Delgado Pérez TODO description
 */
public final class InterfazComandos {

    private static Scanner input = new Scanner(System.in);

    private InterfazComandos() {
    }

    public static void añadirProducto() throws IllegalArgumentException {
        String nombre = "", marca = "";
        Alimento.TipoAlimento tipo;
        LocalDate fechaCaducidad = null;
        float precioUnidad;
        int descuento, cantidad;
        System.out.print("Inserte el nombre: ");
        nombre = input.nextLine();
        if (checkExistencia(nombre)) {
            throw new IllegalArgumentException("Articulo ya existente");
        }
        System.out.print("Inserte la marca: ");
        marca = input.nextLine();
        System.out.println("Inserte el numero del tipo de alimento: "
                + "1- BEBIDA"
                + "2- CONGELADO"
                + "3- EMBUTIDO"
                + "4- BOLLERIA"
                + "5- CONSERVANTES,"
                + "6- OTROS");
        switch (input.nextInt()) {
            case 1:
                tipo = Alimento.TipoAlimento.BEBIDA;
                break;
            case 2:
                tipo = Alimento.TipoAlimento.CONGELADO;
                break;
            case 3:
                tipo = Alimento.TipoAlimento.EMBUTIDO;
                break;
            case 4:
                tipo = Alimento.TipoAlimento.BOLLERIA;
                break;
            case 5:
                tipo = Alimento.TipoAlimento.CONSERV;
                break;
            case 6:
                tipo = Alimento.TipoAlimento.OTROS;
                break;
            default:
                tipo = null;
                break;
        }
        System.out.print("Inserte la fecha de caducidad (formato yyyy-mm-dd o pulsa enter si es la actual): ");
        try {
            fechaCaducidad = LocalDate.parse(input.nextLine());
        } catch (Exception ex) {
            System.out.println("Se insertó el dia actual dado que la fecha no fue válida");
            fechaCaducidad = LocalDate.now();
        }
        System.out.print("Inserte el precio por unidad: ");
        precioUnidad = input.nextFloat();
        System.out.print("Inserte su descuento (solo el número): ");
        descuento = input.nextInt();
        input.nextLine();
        System.out.print("Inserte la cantidad de dicho producto: ");
        cantidad = input.nextInt();
        input.nextLine();
        Alimento producto = new Alimento(nombre, marca, tipo, precioUnidad, fechaCaducidad, descuento);
        //TODO pedir cantidad alimentos
        try {
            insertarAlimento(producto, cantidad);
        } catch (IllegalArgumentException ex) {
            throw ex;
        }

    }

    public static void añadirCesta() {

    }
}

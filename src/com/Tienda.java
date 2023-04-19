package com;

import java.util.Scanner;
import static com.InterfazComandos.*;

/**
 * @author Daniel Delgado Pérez 
 * TODO description
 */
public class Tienda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Almacen almacen = new Almacen();
        boolean exit = false;
        System.out.println("Bienvenido, seleccione la opcion que desea realizar:\n"
                + "1- Insertar alimento"
                + "2- Añadir a la cesta"
                + "3- Pagar cesta"
                + "4- Hacer envio"
                + "5- Ver envios"
                + "6- Buscar alimentos por nombre"
                + "7- Buscar alimentos por tipo"
                + "8- Ver mi cesta"
                + "9- Info del alimento por nombre"
                + "0- Salir");
        while(!exit) {
            System.out.print("Inserte la operacion, inserte 0000 para repetir las posibles opciones: ");
            switch (input.nextInt()) {
                case 1: 
                    try {
                       añadirProducto(); 
                    }
                    break;
                    
                case 2:
                    añadirCesta();
                    break;
                    
                case 3:
                    pagarCesta();
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                    
                    break;
                    
                case 7:
                    
                    break;
                    
                case 8:
                    
                    break;
                    
                case 9:
                    
                    break;
                    
                case 0:
                    exit = true;
                    break;
            }
        }
        System.out.println("¡Vuelva pronto!");
    }

}

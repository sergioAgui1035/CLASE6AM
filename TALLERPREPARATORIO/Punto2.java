package TALLERPREPARATORIO;

import TALLERPREPARATORIO.Modelos.Producto;

public class Punto2 {
    public void cantidadTotal (Producto[][] productos){
        int cantidadTotal=0;
        for(int i=0; i<productos.length; i++){
            for (int j = 0; j < productos.length; j++) {
                cantidadTotal =+ productos[i][j].cantidad;
            }
        
        }
        System.out.println("La cantidad de todos los productos es: "+cantidadTotal);
    }
}

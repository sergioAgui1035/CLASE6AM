package TALLERPREPARATORIO;

import TALLERPREPARATORIO.Modelos.Producto;

public class Punto2 {
    public int punto1 (Producto[] productos, String nombreProducto){
        int cantidadTotal=0;
        for(int i=0; i<productos.length; i++){
            cantidadTotal =+ productos[i].cantidad;
        
        }
        return cantidadTotal;
    }
}

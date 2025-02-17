package TALLERPREPARATORIO;

import Modelos;

public class Punto1 {

    public int punto1 (Producto[] productos, String nombreProducto){
        int posicionProducto=0;
        for(int i=0; i<productos.length; i++){
            if (productos[i].nombre == nombreProducto) {
                posicionProducto = i;
            }
        }
        return posicionProducto;
    }
    
}

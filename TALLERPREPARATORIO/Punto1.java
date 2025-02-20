package TALLERPREPARATORIO;

import TALLERPREPARATORIO.Modelos.Producto;

public class Punto1 {

    public void posicionProducto (Producto[][] productos, String nombreProducto){
        for(int i=0; i<productos.length; i++){
            for (int j = 0; j < productos.length; j++) {     
                if (productos[i][j].nombre == nombreProducto) {
                    System.out.println("El producto esta en la fila "+i+" y en la columna "+j);
                }
            }
        }
    }
    
}

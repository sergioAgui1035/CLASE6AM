package TALLERPREPARATORIO;

import TALLERPREPARATORIO.Modelos.Tienda;
import TALLERPREPARATORIO.Modelos.Producto;

public class Punto5 {
    
    public void sumarStock (Tienda[] tiendas){
        Producto[] ProductosFinales = new Producto[tiendas[0].producto.length +tiendas[1].producto.length];
        for(int i=0; i<tiendas[0].producto.length; i++){
            for(int j=0; j<tiendas[1].producto.length; j++){
                if (tiendas[0].producto[i].nombre == tiendas[1].producto[i].nombre) {7
                    Producto producto = new Producto();
                    producto.setNombre(tiendas[0].producto[i].nombre);
                    producto.setCantidad( tiendas[0].producto[i].cantidad +tiendas[1].producto[i].cantidad);
                    producto.setPrecio(tiendas[0].producto[i].precio);
                    ProductosFinales[i] = producto;
                }
            }
        }
    }
}
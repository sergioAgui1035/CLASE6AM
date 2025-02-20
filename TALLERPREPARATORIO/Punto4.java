package TALLERPREPARATORIO;

import TALLERPREPARATORIO.Modelos.Libro;

public class Punto4 {
    
    public void precioMasAlto (Libro[][] libros){
        for(int i=0; i<libros.length; i++){
            for (int j = 0; j < libros.length; j++) {
                System.out.println("El libro con el precio mas alto es: "+libros[i][j].titulo);
            }
        
        }
    }
}

package TALLERPREPARATORIO;

import java.util.Scanner;

import TALLERPREPARATORIO.Modelos.Libro;
import TALLERPREPARATORIO.Modelos.Producto;

public class MetodosGenerales {
    Scanner sc = new Scanner(System.in);
    public Producto[][] LlenarMatrizProducto(int d){
       Producto[][] matriz = new Producto[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Producto producto = new Producto();
                System.out.println("Ingrese el nombre del producto");
                producto.nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto");
                producto.nombre = sc.nextLine();
                System.out.println("Ingrese la cantidad del producto");
                producto.nombre = sc.nextLine();
                matriz[i][j] = producto;
            }
            
        }

        return matriz;
    }

    public Libro[][] LlenarMatrizLibro(int d){
        Libro[][] matriz = new Libro[d][d];
         for (int i = 0; i < d; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 Libro libro = new Libro();
                 System.out.println("Ingrese el titulo del libro");
                 libro.titulo = sc.nextLine();
                 System.out.println("Ingrese el autor el libro");
                 libro.autor = sc.nextLine();
                 System.out.println("Ingrese el precio del libro");
                 libro.precio = sc.nextBigDecimal();
                 matriz[i][j] = libro;
             }
             
         }
 
         return matriz;
     }
}

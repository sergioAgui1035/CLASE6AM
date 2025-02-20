package TALLERPREPARATORIO;

import java.util.Scanner;

import TALLERPREPARATORIO.Modelos.Libro;
import TALLERPREPARATORIO.Modelos.Producto;

public class MetodosGenerales {
    Scanner sc = new Scanner(System.in);
    public Producto[][] LlenarMatrizProducto(Producto[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Producto producto = new Producto();
                System.out.println("Ingrese el nombre del producto");
                while (sc.hasNext()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                producto.nombre = sc.nextLine();
                System.out.println("Ingrese el precio del producto");
                while (sc.hasNextInt()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                producto.nombre = sc.nextLine();
                System.out.println("Ingrese la cantidad del producto");
                while (sc.hasNextInt()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                producto.nombre = sc.nextLine();
                matriz[i][j] = producto;
            } 
        }
        return matriz;
    }

    public Libro[][] LlenarMatrizLibro(Libro[][] matriz){
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 Libro libro = new Libro();
                 System.out.println("Ingrese el titulo del libro");
                 while (sc.hasNext()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                 libro.titulo = sc.nextLine();
                 System.out.println("Ingrese el autor el libro");
                 while (sc.hasNext()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                 libro.autor = sc.nextLine();
                 System.out.println("Ingrese el precio del libro");
                 while (sc.hasNextInt()) {
                    System.out.println("Dato incorrecto");
                    sc.next();
                }
                 libro.precio = sc.nextInt();
                 matriz[i][j] = libro;
             }
         }
         return matriz;
     }
}

package TALLERPREPARATORIO;

import java.util.Scanner;

import TALLERPREPARATORIO.Modelos.Libro;
import TALLERPREPARATORIO.Modelos.Producto;

public class TallerPreparatorio {
    public static void main(String[] args) {
        MetodosGenerales metodos = new MetodosGenerales();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un punto del 1 al 11: ");
        while (sc.hasNextInt()) {
            System.out.println("Dato incorrecto.");
            sc.next();
        }
        int punto = sc.nextInt();
        System.out.println("Ingrese el tamaño de la matriz: ");
        while (sc.hasNextInt()) {
            System.out.println("Dato incorrecto.");
            sc.next();
        }
        int dimension = sc.nextInt();
        Producto[][] matrizProducto = new Producto[dimension][dimension];
        Libro[][] matrizLibro = new Libro[dimension][dimension];
        switch (punto) {
            case 1:
                Punto1 p1 = new Punto1();
                matrizProducto = metodos.LlenarMatrizProducto(matrizProducto);
                System.out.println("Ingrese el nombre del producto que quiere buscar: ");
                while (sc.hasNext()) {
                    System.out.println("Dato incorrecto.");
                    sc.next();    
                }
                String nombreProducto = sc.next();
                p1.posicionProducto(matrizProducto, nombreProducto);
                break;
            case 2:
                Punto2 p2 = new Punto2();
                matrizProducto = metodos.LlenarMatrizProducto(matrizProducto);
                p2.cantidadTotal(matrizProducto);
                break;
            case 3:
                Punto3 p3 = new Punto3();
                matrizLibro = metodos.LlenarMatrizLibro(matrizLibro);
                p3.precioMasAlto(matrizLibro);
                break;
            default:
                break;
        }

    }
    
}

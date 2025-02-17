package TALLERPREPARATORIO;

import java.util.ArrayList;
import java.util.Scanner;

import TALLERPREPARATORIO.Modelos.Producto;

public class MetodosGenerales {
    Scanner sc = new Scanner(System.in);
    public int[] LlenarMatriz(){
        System.out.println("Ingrese cuantos productos desea ingresar: ");
        int cantidadProductos = sc.nextInt();
        Producto[] productos = new ArrayList<>(Producto());
        for (int i = 0; i < cantidadProductos; i++) {
            
        }

        return matriz;
    }
}

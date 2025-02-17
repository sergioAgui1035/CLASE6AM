package TALLERPREPARATORIO;

import java.util.Scanner;

public class TallerPreparatorio {
    public static void main(String[] args) {
        MetodosGenerales metodos = new MetodosGenerales();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un punto del 1 al 11");
        int punto = sc.nextInt();

        int[][] matriz = metodos.CrearMatriz(punto);

        switch (punto) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.SumarMatriz(matriz);
                break;
            case 2:
                Punto2 p2 = new Punto2();
                p2.MostrarPosicionNumeroMasAlto(matriz);
                break;
            default:
                break;
        }


       

  
        //metodos.SumarMatriz(matriz);
        //metodos.MostrarPares(matriz);
        //metodos.MostrarImpares(matriz);

    }
    
}

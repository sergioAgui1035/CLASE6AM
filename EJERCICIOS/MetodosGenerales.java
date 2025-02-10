package EJERCICIOS;

import java.util.Scanner;

public class MetodosGenerales {

    public int SolicitarDimension(){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        return d;
    }
     //Metodo crea los numeros de una matriz
    public int[][] CrearMatriz(int dimension){

        int[][] matriz = new int[dimension][dimension];

        for(int i=0; i<dimension; i++){
            for(int j=0; j<dimension; j++){
                matriz[i][j] = (int) (Math.random()* 500 + 1);
            }
        }
        return matriz;
    }

     

     //Metodo muestra los numeros pares de una matriz
    public void MostrarPares(int[][] matriz){
        System.out.println("Numeros pares:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if (matriz[i][j]%2 == 0) {
                    System.out.print(" - "+matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    //Metodo muestra los numeros impares de una matriz
    public void MostrarImpares(int[][] matriz){
        System.out.println("Numeros impares:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if (matriz[i][j]%2 != 0) {
                    System.out.print(" - "+matriz[i][j]);
                }
            }
            System.out.println();
        }
    }    

     

}

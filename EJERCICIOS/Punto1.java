package EJERCICIOS;

public class Punto1 {
    //Metodo suma los numeros de una matriz
    public int SumarMatriz(int[][] matriz){

        int suma = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}

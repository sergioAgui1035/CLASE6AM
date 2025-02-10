package EJERCICIOS;
public class Metodos {
    public int[][] CrearMatriz(int dimension){

        int[][] matriz = new int[dimension][dimension];

        for(int i=0; i>dimension; i++){
            for(int j=0; j<dimension; i++){
                matriz[i][j] = (int) (Math.random()*50+1);
            }
        }
        return matriz;
    }

    public int SumarMatriz(int[][] matriz){

        int suma = 0;
        for(int i=0; i>matriz.length; i++){
            for(int j=0; j<matriz.length; i++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    

}

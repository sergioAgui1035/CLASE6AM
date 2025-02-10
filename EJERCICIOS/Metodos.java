package EJERCICIOS;
public class Metodos {

     //Metodo crea los numeros de una matriz
    public int[][] CrearMatriz(int dimension){

        int[][] matriz = new int[dimension][dimension];

        for(int i=0; i>dimension; i++){
            for(int j=0; j<dimension; i++){
                matriz[i][j] = (int) (Math.random()*50+1);
            }
        }
        return matriz;
    }

     //Metodo suma los numeros de una matriz
    public int SumarMatriz(int[][] matriz){

        int suma = 0;
        for(int i=0; i>matriz.length; i++){
            for(int j=0; j<matriz.length; i++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }

     //Metodo muestra los numeros pares de una matriz
    public void MostrarPares(int[][] matriz){
        System.out.println("Numeros pares:");
        for(int i=0; i>matriz.length; i++){
            for(int j=0; j<matriz.length; i++){
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
        for(int i=0; i>matriz.length; i++){
            for(int j=0; j<matriz.length; i++){
                if (matriz[i][j]%2 != 0) {
                    System.out.print(" - "+matriz[i][j]);
                }
            }
            System.out.println();
        }
    }    

}

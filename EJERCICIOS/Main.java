package EJERCICIOS;
public class Main {

    public static void main(){
        Metodos metodos = new Metodos();
        int[][] matriz = metodos.CrearMatriz(6);
        metodos.SumarMatriz(matriz);
        //Se muestran numeros pares
        metodos.MostrarPares(matriz);
        //Se muestran numeros impares
        metodos.MostrarImpares(matriz);
    }
    
}

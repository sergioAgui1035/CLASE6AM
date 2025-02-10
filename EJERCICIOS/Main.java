package EJERCICIOS;
public class Main {

    public static void main(){
        Metodos metodos = new Metodos();
        int[][] matriz = metodos.CrearMatriz(6);
        metodos.SumarMatriz(matriz);
        metodos.MostrarPares(matriz);
        //Se muestran numeros impares
        metodos.MostrarImpares(matriz);
    }
    
}

package EJERCICIOS;

public class Punto2 {
    //Metodo muestra la pocision del numero mas alto de la matriz
    public void MostrarPosicionNumeroMasAlto(int[][] matriz){
        System.out.print("El numero mas alto esta en la posicion: ");
        int NumeroAlto = 0;
        int posicion1 = 0;
        int posicion2 = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if (matriz[i][j] > NumeroAlto) {
                    NumeroAlto = matriz[i][j];
                    posicion1 = i;
                    posicion2 = j;
                }
            }
        }
        System.out.print(posicion1 +" , "+posicion2);
        System.out.print(" Y es el numero: "+ NumeroAlto);
    }   
}

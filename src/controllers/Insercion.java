package controllers;

public class Insercion {

    public void ordenamientoInsercion(int[] arreglo){
        int pasajero = 0;

        for(int i = 1; i < arreglo.length; i++){
            pasajero = arreglo[i];
            int j = i - 1; 

            while(j >=  0 && (arreglo[j] > pasajero)){ // si el arreglo[j] es mayor a pasajeros, entra dentro del bucle
                arreglo[j + 1] = arreglo[j];
                j--; 
            }
            
            if(arreglo[j + 1] != pasajero){
                arreglo[j + 1] = pasajero;
            }
        }

    }


    public void imprimirArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + "\t");  
        }
        System.out.println();
    }
}

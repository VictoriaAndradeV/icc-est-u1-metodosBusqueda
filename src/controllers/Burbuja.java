package controllers;

import models.Persona;

public class Burbuja {

    public void ordenamientoInsercion(Persona[] personas){
        for(int i = 0; i < personas.length - 1; i++){
            for (int j = 0; j < personas.length -1 -i; j++){
                if(personas[j].getName().compareTo(personas[j + 1].getName())){
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    
                }
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

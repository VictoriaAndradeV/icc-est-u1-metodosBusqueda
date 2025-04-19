//import java.util.Scanner;
import models.Persona;
import controllers.BusquedaBinaria;

public class App {

    public static void main(String[] args) throws Exception {
        
        Persona [] personas = new Persona[7];
        personas [0] = new Persona (101, "Juan");
        personas [1] = new Persona (102, "Maria");
        personas [2] = new Persona (103, "Carlos");
        personas [3] = new Persona (104, "Ana");
        personas [4] = new Persona (105, "Luis");
        personas [5] = new Persona (106, "Sofia");
        personas [6] = new Persona (107, "Pedro");

        //MetodoBusqueda metodoBusqueda = new MetodoBusqueda(personas);

        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(personas);

        busquedaBinaria.showPersonByCode();

        /*
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = {10, 15, 23, 56, 19, 45};

        
        System.out.println("Arreglo original");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + "\t");  
        }
        System.out.println();
        int numero = 0;
        int posicion;

        System.out.println("Ingrese el numero que desea buscar");
        numero = scanner.nextInt();


        /*Busqueda
        posicion = metodoBusqueda.busquedaLieal(arreglo, numero);

        if(posicion == -1){
            System.out.println("No se ha encontrado el elemento");
        }
        System.out.println("El numero ->" + numero + "se encuentra en la posicion ->" + (posicion + 1));
        
        scanner.close();*/
    
    }
}

package views;

import java.util.Scanner;

public class ShowConsole {

    private Scanner scanner = new Scanner(System.in);
    
    public void showMenu(){

        System.out.println("Metodo Busqueda");

    }

    public int getCode(){
        System.out.println("Ingrese el codigo");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado " +codigo);
        return codigo;
    }

    public void showMesagge(String message){
        System.out.println(message);
    }
}

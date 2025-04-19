package controllers;
import models.Persona;
import views.ShowConsole;


public class BusquedaBinaria {

    private Persona[] people; //variable global, arreglo de personas 
    private ShowConsole showConsole; //creamos una variable tipo privada de la clase ShowConsole

    public BusquedaBinaria (Persona[] personas){
        this.people = personas; // instanciada en el constructor, la instancia se hace con el valor que llega como argumento
        
        this.showConsole = new ShowConsole();
        showConsole.showMesagge("Metodos de Busqueda Binaria");
   
    }

    public int findPersonByCode(int code){
        int bajo = 0;
        int alto = (people.length -1);

        while(bajo <= alto){
            //int central = bajo + (alto - bajo)/2;
            int central = (bajo + alto)/2;

            if(people[central].getCode() == code){
                return central;
            }

            if(people[central].getCode() < code){ //nos vamos a la derecha, se actualiza el bajo
                bajo = central + 1;
            }else {
                alto = central - 1;
            }
        }
        return -1;
    }

    /*
    private int findPersonByName(Persona[] people){
        for(int i = 0; )
        


        return -1;
    }*/

    public void showPersonByName(){
        int nameToFind = showConsole.getName();
        int indexPerson = findPersonByCode(nameToFind);
    }

    public void showPersonByCode(){
        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);

        if(indexPerson == -1) {
            showConsole.showMesagge("No hay la persona con el codigo");

        }else{
            showConsole.showMesagge("Persona con codigo " + codeToFind+ "  encontrada");
            showConsole.showMesagge(people[indexPerson].toString());
        }
    } 
}

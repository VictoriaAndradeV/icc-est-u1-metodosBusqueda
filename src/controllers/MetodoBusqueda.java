package controllers;
import views.ShowConsole;
import models.Persona;

public class MetodoBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;

    public MetodoBusqueda(Persona[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
    }

    public int busquedaLieal(int [] arreglo, int numero){
        for (int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == numero){
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++){
            if(people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(int code){
        int codeToFind = showConsole.getCode(); //llama al metodo de obtener un numero 
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMesagge("Persona encontrada");
            showConsole.showMesagge(people[indexPerson]);
        }else {
            showConsole.showMesagge("Persona con codigo " +indexPerson+ " no encontrada");
        }
    }
}

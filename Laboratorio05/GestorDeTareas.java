package Laboratorio05;
import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas<T> {
    private Nodo<T> cabeza;

    private void agregarTarea(T tarea){
        Nodo<T> nuevo = new Nodo<>(tarea, null);
        if(cabeza == null){
            cabeza = nuevo;
        } else{
            Nodo<T> actual = cabeza;
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
    }

    public boolean eliminarTarea(T tarea){
        if(cabeza == null) return false;
        if(cabeza.getData().equals(tarea)){
            cabeza = cabeza.getSig();
            return true;
        }

        Nodo<T> actual = cabeza;
        while(actual.getSig() != null && !actual.getSig().getData().equals(tarea)){
            actual = actual.getSig();
        }

        if(actual.getSig() != null){
            actual.setSig(actual.getSig().getSig());
            return true;
        }

        return false;
    }
    
}

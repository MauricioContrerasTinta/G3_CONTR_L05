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
        }
    }
}

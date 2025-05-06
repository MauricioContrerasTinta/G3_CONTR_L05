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

    public boolean contieneTarea(T tarea){
        Nodo<T> actual = cabeza;
        while(actual != null){
            if(actual.getData().equals(tarea)) return true;
            actual = actual.getSig();
        }
        return false;
    }

    public void imprimirTareas(){
        Nodo<T> actual = cabeza;
        while(actual != null){
            System.out.println(actual.getData());
            actual = actual.getSig();
        }
    }

    public int contarTareas(){
        int contador = 0;
        Nodo<T> actual = cabeza;
        while(actual != null){
            contador++;
            actual = actual.getSig();
        }
        return contador;
    }

    public T obtenerTareaMasPrioritaria(){
        if(cabeza == null || !(cabeza.getData() instanceof Tarea)) return null;
        Nodo<T> actual = cabeza;
        Tarea mejor = (Tarea) actual.getData();

        while(actual != null){
            Tarea T = (Tarea) actual.getData();
            if(t.getPrioridad() > mejor.getPrioridad()){
                mejor = t;
            }
            actual = actual.getSig();
        }
        return (T) mejor;
    }

    public void invertirTareas(){
        Nodo<T> anterior = null;
        Nodo<T> actual = cabeza;
        Nodo<T> siguiente;

        while(actual != null){
            siguiente = actual.getSig();
            actual.setSig(anterior);
        }
    }
}

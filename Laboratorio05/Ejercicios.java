package Laboratorio05;

public class Ejercicios {
    
    public static <T> boolean buscarElemento(Nodo<T> cabeza, T valor){
        Nodo<T> actual = cabeza;
        while(actual != null){
            if(actual.getData().equals(valor)) return true;
            actual = actual.getSig();
        }
        return false;
    }

    public static <T> Nodo<T> invertirLista(Nodo<T> cabeza){
        Nodo<T> anterior = null;
        Nodo<T> actual = cabeza;
        while (actual != null) {
            Nodo<T> siguiente = actual.getSig();
            actual.setSig(anterior);
            anterior = actual;
            actual = siguiente;
        }
        return anterior;
    }

    public static <T> Nodo<T> insertarAlFinal(Nodo<T> cabeza, T valor){
        Nodo<T> nuevo = new Nodo<>(valor, null);
        if(cabeza == null) return nuevo;
        Nodo<T> actual = cabeza;
        while (actual.getSig() != null) {
            actual = actual.getSig();
        }
        actual.setSig(nuevo);
        return cabeza;
    }

    public static <T> int contarNodos(Nodo<T> cabeza){
        
    }

}

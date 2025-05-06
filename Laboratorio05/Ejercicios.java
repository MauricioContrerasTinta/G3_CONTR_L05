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
    }

}

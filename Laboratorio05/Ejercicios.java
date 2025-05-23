package Laboratorio05;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios {
    
    public static <T> boolean buscarElemento(Nodo<T> cabeza, T valor) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.getData().equals(valor)) {
                return true;
            }
            actual = actual.getSig();
        }
        return false;
    }

    public static <T> Nodo<T> invertirLista(Nodo<T> cabeza) {
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
        int contador = 0;
        Nodo<T> actual = cabeza;
        while (actual != null){
            contador++;
            actual = actual.getSig();
        }
        return contador; 
    }

    public static <T> boolean sonIguales(Nodo<T> l1, Nodo<T> l2){
        while (l1 != null && l2 != null) {
            if (!l1.getData().equals(l2.getData())) return false;
            l1 = l1.getSig(); 
            l2 = l2.getSig();
        }
        return l1 == null && l2 == null;
    }

    public static <T> Nodo<T> concatenarListas(Nodo<T> l1, Nodo<T> l2){
        if (l1 == null) return l2;
        Nodo<T> actual = l1;
        while (actual.getSig() != null) {
            actual = actual.getSig();
        }
        actual.setSig(l2);
        return l1;
    }

    public static <T> boolean buscarElemento(List<T> lista, T valor) {
        return lista.contains(valor);
    }

    public static <T> List<T> invertirLista(List<T> lista) {
        List<T> invertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            invertida.add(lista.get(i));
        }
        return invertida;
    }

    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

}

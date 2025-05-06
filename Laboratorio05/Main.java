package Laboratorio05;
import java.util.ArrayList;
import java.util.List;
import Laboratorio05.Ejercicios;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();
        List<Tarea> tareasCompletadas = new ArrayList<>();

        Tarea t1 = new Tarea("Comer", 2);
        Tarea t2 = new Tarea("Dormir", 1);
        Tarea t3 = new Tarea("Estudiar",3 );
        
        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);

        gestor.eliminarTarea(t2);

        System.out.println("Tareas: ");
        gestor.imprimirTareas();

        System.out.println("Contiene Comer? " + gestor.contieneTarea(t1));

        gestor.invertirTareas();
        System.out.println("Lista invertida: ");
        gestor.imprimirTareas();

        gestor.transferirTareaAListaCompletada(t3, tareasCompletadas);
        System.out.println("Tareas después de completar una: ");
        gestor.imprimirTareas();

        System.out.println("Tareas completadas:");
        for (Tarea t : tareasCompletadas) {
            System.out.println(t);
        }

        System.out.println("Tarea más prioritaria: " + gestor.obtenerTareaMasPrioritaria());

        System.out.println("EJERCICIOS:");


        boolean existe = Ejercicios.buscarElemento(tareasCompletadas, t3); 
        System.out.println("Está la tarea estudiar en completadas? " + existe);
        
        List<Tarea> invertida = Ejercicios.invertirLista(tareasCompletadas);
        System.out.println("Tareas completadas invertidas:");
        Ejercicios.imprimirLista(invertida);

        Nodo<Tarea> nuevaCabeza = new Nodo<>(t1, null);
        Ejercicios.insertarAlFinal(nuevaCabeza, t2);
        System.out.println("Lista después de insertar al final:");
        Nodo<Tarea> actual = nuevaCabeza;
        while (actual != null) {
            System.out.println(actual.getData());
            actual = actual.getSig();
        }

        int totalNodos = Ejercicios.contarNodos(nuevaCabeza);
        System.out.println("Total de nodos: " + totalNodos);

        Nodo<Tarea> lista1 = new Nodo<>(t1, new Nodo<>(t2, null));
        Nodo<Tarea> lista2 = new Nodo<>(t1, new Nodo<>(t2, null));
        boolean iguales = Ejercicios.sonIguales(lista1, lista2);
        System.out.println("¿Son iguales? " + iguales);

        Nodo<Tarea> listaConcatenada = Ejercicios.concatenarListas(lista1, new Nodo<>(t3, null));
        System.out.println("Lista concatenada:");
        Nodo<Tarea> cursor = listaConcatenada;
        while (cursor != null) {
            System.out.println(cursor.getData());
            cursor = cursor.getSig();
        }
    }
}

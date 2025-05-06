package Laboratorio05;
import java.util.ArrayList;
import java.util.List;

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
    }
}

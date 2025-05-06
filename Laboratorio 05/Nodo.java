public class Nodo <E> {
    private E data;
    private Nodo<E> sig;

    public Nodo(E data, Nodo<E> sig){
        this.data = data;
        this.sig = sig;
    }
}
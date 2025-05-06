public class Nodo <E> {
    private E data;
    private Nodo<E> sig;

    public Nodo(E data, Nodo<E> sig){
        this.data = data;
        this.sig = sig;
    }

    public E getData(){
        return data;
    }

    public Nodo<E> getSig(){
        return sig;
    }

    public void setData(E data){
        this.data = data;
    }

    public void setSig(Nodo<E> sig){
        this.sig = sig;
    }
}
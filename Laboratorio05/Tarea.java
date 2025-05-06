package Laboratorio05;

public class Tarea {
    private String titulo;
    private int prioridad;

    public Tarea(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + " - Prioridad: " + this.prioridad;
    }
}

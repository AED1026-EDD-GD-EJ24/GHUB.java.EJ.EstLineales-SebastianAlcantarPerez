package miPrincipal;
public class Nodo<T>{
    //Atrivuto valor de tipo T almacena la referencia al objeto que se
    //guarda en el Nodo
    private T valor;
    //Referencia al siguiente nodo de la lista
    private Nodo siguiente;
    //Constructor por defecto
    public Nodo(){
        valor = null;
        siguiente = null;
    }
    //Métodos set/get
    public void setValor(T valor){
        this.valor = valor;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    public  T getValor(){
        return valor;
    }
    public Nodo<T> getSiguiente(){
        return siguiente;
    }

}
package miPrincipal;

public class Lista<T> {
    //Atributos
    //Primer nodo de la lista
    private Nodo<T> cabeza;
    //total de elementos de la lista
    private int tamanio;
    public Lista(){
        cabeza = null;
        tamanio = 0;
    }
    public int getTamanio(){
        return tamanio;
    }
    public boolean esVacia(){
        if(cabeza == null){
            return true;
        }
        else
            return false;
    }
    //agrega un nuevo nodo al final de la lista
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if(esVacia()){
            cabeza = nuevo;
        }
        else{
            //Agregar al final de la lista
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
}

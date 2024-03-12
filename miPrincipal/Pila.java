package miPrincipal;

public class Pila <T>{
    //Atrivuto cabeza apunta al tope de la pila
    private Nodo<T>cabeza;
    //Almacena el total de elementos de la pila
    private int tamanio;
    //Constructor por defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //Métodos get
    public int getTamanio(){
        return tamanio;
    }
    //Métodos de isntancia
    public boolean esVacia(){
        return (cabeza == null);
    }   
    public void apilar(T valor){
        //Crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //Fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //La cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }else{
            //Se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //La nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //Incremetar el tamaño porque hay un nuevo elemento en la pila
        tamanio++;
    }
    //Eliminar un elemento de la pila
    public void retirar(){
        if(!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //Devuelve el elemento almacenado en el tope de la cima
    public T cima(){
        if(!esVacia()){
            return cabeza.getValor();
        }else{
            return null;
        }
    }

}



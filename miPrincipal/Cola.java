package miPrincipal;
public class Cola<T>{
    //Ativuto cabeza, que apunta al primer elemento de la cola
    private Nodo<T> cabeza;
    //Atributo cola, apunta al ultimo elemento de la cola
    private Nodo<T> cola;
    //Almacena el total de elementos de la cola
    private int tamanio;
    //constructor defecto
    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }
    //Métodos set/get
    public int getTamanio(){
        return tamanio;
    }
    //Métodos de instancia
    public boolean esVacia(){
        return(cabeza == null);
    }
    //Encolar un elemento nuevo
    public void encolar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //Fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza y cola apunta al nodo nuevo
            cabeza = nuevo;
            cola = nuevo;
        } else{
            //se enlaza el campo siguiente de la cola con el nuevo elemento
            cola.setSiguiente(nuevo);
            cola = nuevo;
        }
        //incrementa el tamanio porque hay un nuevo elemento en la cola
        tamanio++;

    }
    //eliminar el primer elemento de la cola
    public void desencolar(){
        if(!esVacia()){
            //Verificar si hay un solo elemento en la cola
            if(cabeza == cola){
                cabeza = null;
                cola = null;
            }
        }else{
            //se elimina el priemr elemento de la cola
            //desplazando la cabeza al siguiente nodo
            cabeza = cabeza.getSiguiente();
        }
        //se disminuye el total de elementos
        tamanio--;
    }
    //devuelve el primer elemento de la cola
    public T frente(){
        if(!esVacia()){
            return cabeza.getValor();
        }else
            return null;
    }
}
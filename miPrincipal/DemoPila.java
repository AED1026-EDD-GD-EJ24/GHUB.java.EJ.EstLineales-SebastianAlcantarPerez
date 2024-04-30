package miPrincipal;

public class DemoPila {
    public static void menu(){
        System.out.println("************************");
        System.out.println("          PILA          ");
        System.out.println("************************");
        System.out.println();
        //Crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer>();
        //apilar algunos datos enteros
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        pila.apilar(1);
        System.out.println("Buscando el numero 5 en la pila");
        System.out.println("El elemento 5 esta en la posición "+pila.buscar(5));
        System.out.println("buscando un elemento que no existe en la pila (tiene que dar -1)");
        System.out.println(pila.buscar(15));
        System.out.println("El tope de la pila es "+pila.cima());
        //se desapila
        pila.retirar();
        System.out.println("El tope de la pila es "+pila.cima());
        //se desapila
        pila.retirar();
        System.out.println("El tope de la pila es "+pila.cima());
        System.out.println("buscando el elemento 5 siendo el tope de la pila");
        System.out.println("el 5 esta en la posicion: "+pila.buscar(5));
    }
}

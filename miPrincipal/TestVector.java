package miPrincipal;
import java.util.Collection;

public class TestVector{
        public static void main(String[] args) {
            //invocar el metodo obtenerLista de la clase UNombre
            Collection<String> lista = UNombre.obtenerLista();
            //iterar la coleccion de nombres y mostrarlos en consola
            for(String nombre:lista){
                System.out.println(nombre);
            }

        }
}
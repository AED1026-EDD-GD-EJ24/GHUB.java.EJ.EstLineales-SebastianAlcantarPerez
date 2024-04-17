package miPrincipal;
/*
 * Proposito: crear un ArrayList de objetos Personas
 * crearemos 1000 personas de forma aleatoria
 * considerando que sus alturas fluctuen entre 100 y 200 cm
 * finalmente mostrar por consola todos los objetos personas
 * creados asi como la media de sus alturas
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import persona.Persona;

public class DemoArrayListPersona{
    public static void menu(){
        System.out.println("************************");
        System.out.println("       ARRAYLIST        ");
        System.out.println("       PERSONA          ");
        System.out.println("************************");
        System.out.println();
        try{
            List<Persona> lp = new ArrayList<Persona>();
            Random r = new Random();
            Persona tmp = null;
            int sumaaltura = 0;
            for(int i = 0; i < 1000; i++){
                lp.add(new Persona(i , "Persona "+i , r.nextInt(100)+100));
            }
            Iterator<Persona> it = lp.iterator();
            while(it.hasNext()){
                tmp = it.next();
                System.out.println(tmp);
                sumaaltura += tmp.getAltura();
            }
            System.out.println("La media del conjunto de personas = "+ sumaaltura/lp.size());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
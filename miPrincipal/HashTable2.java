package miPrincipal;
import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Collection;
import javax.swing.text.AttributeSet.ColorAttribute;
public class HashTable2<T>{
    private Hashtable<String, LinkedList<T>> tabla;
    private Vector<String> claves;
    public HashTable2(){
        tabla = new Hashtable<String, LinkedList<T>>();
        claves = new Vector<String>();
    }
    public void put(String key, T ele){
        LinkedList<T> lst = tabla.get(key);
        if(lst == null){
            lst = new LinkedList<T>();
            tabla.put(key , lst);
            claves.add(key);
        }
        lst.addLast(ele);
    }
    public LinkedList<T> get(String key){
        return tabla.get(key);
    }
    public Collection<String> keys(){
        return claves;
    }
}

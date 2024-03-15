package miPrincipal;

public class Delimitadores {
    public boolean evaluacion(String cadena){
        Pila<String> pcaracteres = new Pila<String>();
        int i=0;
        boolean masElementosPorLeer = true;
        while (i<cadena.length() && masElementosPorLeer){
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;
            switch(car){
                //en caso de apilar se da cuando
                //el caracter sea un operador de apertura
                //( [ { /* 
                case '(':
                   pcaracteres.apilar(charToString(')'));
                   break;
                case '[':
                   pcaracteres.apilar(charToString(']'));
                   break;
                case '{':
                   pcaracteres.apilar(charToString('}'));
                   break;
                case '/':
                   //verificar si el siguiente caractes es un *
                   if (siguienteEsAsterisco(cadena, i)){
                    pcaracteres.apilar(charToString('/'));
                    i++;
                   }
                   break;
                //para desapilar cuando el caracter leído
                //sea ) ] } */
                case ')':
                case ']':
                case '}':
                {
                    //compara que correspondan
                    String aux = pcaracteres.cima();
                    if (aux !=null)
                    {
                        if(s.compareTo(aux)==0)
                        {
                            //Hay correspondencia y por lo tanto
                            //lo elimino
                            pcaracteres.retirar();
                        }
                        else{
                             //ya no tiene caso seguir leyendo
                             //ya la evaluación esta determinada en falso
                             //es decir la expresion es incorrecta
                           masElementosPorLeer = false;
                        }
                    }
                    ///esta linea es nueva
                    break;
                }
                case '*':
                   if(siguienteEsDiagonal(cadena,i)){
                     pcaracteres.retirar();
                     i++;
                   }
                   
            }
        }//Aqui termina el while
        if (pcaracteres.esVacia() && masElementosPorLeer)
           return true;
        else
           return false;

    }//Termina método
    private static String charToString(char ch){
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsterisco(String cadena, int posicion){
     
        char car = cadena.charAt(posicion);
        if(car=='*')
           return true;
        else
           return false;
    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion){
        
        char car = cadena.charAt(posicion);
        if(car=='/')
           return true;
        else
           return false;
    }

    
}
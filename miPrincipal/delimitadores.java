package miPrincipal;

public class delimitadores {
    public boolean evaluacion(String cadena){
        Pila<String> pcaracteres = new Pila<String>();
        int i = 0;
        boolean masElementosPorLeer = true;
        while(i < cadena.length() && masElementosPorLeer){
            char car = cadena.charAt(i);
            String s = charToString(car);
            i++;
            switch (car) {
                //en caso de apilar se da cuando
                //El caracter sea un operador de apertura
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
                    break;
                //para desapilar cuando el caracter leido
                //sea ) ] } */
                case ')':

                    break;
                case ']':
                    break;
                case '}':
                {
                    //compara que corresponda
                    String aux = pcaracteres.cima();
                    if(aux != null){
                        if(s.compareTo(aux) == 0){
                            //hay correspondencia y por lo tanto
                            //lo elimino
                            pcaracteres.retirar();
                        }
                        else{
                            //ya no tiene caso seguir leyendo 
                            //ya la evaluación esta determinada en falso
                            //es decir que la expresion es incorrecta
                            masElementosPorLeer = false;
                        }
                    }
                }
            }
        }
    }//Termina método
    private static String charToString(char ch){
        return String.valueOf(ch);
    }
    private static boolean siguienteEsAsteristo(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if(car == '*')
            return true;
        else
            return false;
    }
    private static boolean siguienteEsDiagonal(String cadena, int posicion){
        char car = cadena.charAt(posicion);
        if(car == '/')
            return true;
        else
            return false;
    }
}

package miPrincipal;

public class ListaDeContactos {
    //Atributos
    private Lista<Contacto> contactos;
    //métodos
    //constructor

    public ListaDeContactos(Lista<Contacto> contactos) {
        contactos = new Lista<Contacto>();
    }
    public Lista<Contacto> mostrarTodosLosContactos(){
        return contactos;
    }
    public boolean agregarContactos(String nombres, String apellidos, String direccion, String correo, String telefono, String celular)throws PosicionIlegalException{
        Contacto con = buscarContacto(nombres, apellidos);
        if(con != null){
            for(int i = 0; i < this.contactos.getTamanio(); i++){
                Contacto contAux = contactos.getValor(i);
                if(contAux.getNombre().equals(nombres) && contAux.getApellidos().equals(apellidos)){
                    contactos.remover(i);
                }
            }
            return true;
        }else{
            return false;
        }
    }
    public boolean modificarContacto(String nombres, String apellidos, String direccion, String correo, String telefono, String celular){
        //verificar si el contacto existe
        Contacto con = buscarContacto(nombres, apellidos);
        if(con == null){
            return false;
        }else{
            //Modifica el contacto con los nuevos datos
            con.setDireccion(direccion);
            con.setCorreo(correo);
            con.setTelefono(telefono);
            con.setCelular(celular);
            return true;
        }
    }
    
}

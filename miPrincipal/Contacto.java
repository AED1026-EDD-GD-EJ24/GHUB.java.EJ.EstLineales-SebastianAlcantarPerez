package miPrincipal;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    
    public Contacto(String nombre, String apellidos, String direccion, String correo, String telefono, String celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.celular = celular;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    private String celular;

    @Override
    public String toString() {
        return nombre + " " + apellidos +" "+ direccion +" "+ correo+" " + telefono + " " + celular "\n"; 
    }
    
    
}

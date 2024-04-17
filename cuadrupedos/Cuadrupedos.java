package cuadrupedos;

public class Cuadrupedos {
    private int idCuadrupedo;
    private String tipo;
    public Cuadrupedos(int idCuadrupedo, String tipo){
        this.tipo = tipo;
    }
    public int getIdCuadrupedo(){
        return idCuadrupedo;
    }
    public void setIdCuadrupedo(){
        this.idCuadrupedo = idCuadrupedo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return "Cuadrupedo =>" + idCuadrupedo + ", tipo = " + tipo ;
    }


}

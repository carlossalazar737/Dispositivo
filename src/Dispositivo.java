public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;
    String getNombre(){

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setActivo(String activo){
        this.activo = activo;
    }
    public void mostrarinformacion(){
        System.out.println("Nombre:"+ nombre +"\nTipo:"+ tipo + "\nActivo:"+activo);
    }
    void mostrarEstado(){
        String estado= activo? "Estado activo":"Estado inactivo";
    }
    void Activar(){
        if (activo==false){
            activo=true;
            System.out.println(nombre+" ha sido activado ");
        }
    }
}
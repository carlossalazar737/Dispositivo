public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean Activo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrarinformacion(){

        System.out.println("Nombre:"+ getNombre() +"\nTipo:"+ getTipo() + "\nActivo:"+activo);
    }
    void mostrarEstado(){

        String estado= activo? "Estado activo":"Estado inactivo";
        System.out.println(estado);
    }
    void Activar(){
        if (activo==false){
            activo=true;
            System.out.println(nombre+" ha sido activado ");
        }
    }
}
public class MainDispositivo {
    public static void  main(String[] args) {
        Dispositivo d1 = new Dispositivo();
        Dispositivo d2 = new Dispositivo();
        d1.setNombre("Teclado");
        d1.setTipo("Entrada");
        d1.setActivo(true);
        d2.setNombre("Mouse");
        d2.setTipo("Entrada");
        d2.setActivo(false);
        d1.mostrarinformacion();
        d1.mostrarEstado();
        d2.mostrarinformacion();
        d2.mostrarEstado();
        d2.Activar();
        d2.mostrarinformacion();
    }
}

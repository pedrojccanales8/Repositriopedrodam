package tercera;

public class gestor {
    public String nombre;
    private String tlf;
    double importeMax;
    public gestor(String nombre, String tlf, double importMax) {
   	 this.nombre = nombre;
   	 this.tlf =tlf;
   	 this.importeMax = importeMax;
    }
    public gestor(String nombre, String tlf) {
   	 this(nombre, tlf, 10000.0);
    }
    String gettlf() {
   	 return tlf;
    }
    void mostrarInformación() {
   	 System.out.println("Nombre: " + nombre);
   	 System.out.println("Telefono: " + tlf);
   	 System.out.println("Importe máximo: " + importeMax + " euros ");
    }
}
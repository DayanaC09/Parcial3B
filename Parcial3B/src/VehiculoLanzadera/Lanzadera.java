package VehiculoLanzadera;

class Lanzadera extends Nave {
    private int empuje;
    private int peso;
    private int capacidadCarga;

    public Lanzadera(String nombre, String descripcion, int empuje, int peso, int capacidadCarga) {
        super(nombre, descripcion);
        this.empuje = empuje;
        this.peso = peso;
        this.capacidadCarga = capacidadCarga;
    }

    
    public void despegar() {
        System.out.println(getNombre() + " despegando...");
    }
    
    public void orbitar() {
        System.out.println(getNombre() + " orbitando...");
           }
}
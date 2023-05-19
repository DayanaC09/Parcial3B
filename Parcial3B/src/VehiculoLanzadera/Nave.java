package VehiculoLanzadera;

abstract class Nave implements ComportamientoNave {
    private String nombre;
    private String descripcion;

    public Nave(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

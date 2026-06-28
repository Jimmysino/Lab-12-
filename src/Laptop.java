
public abstract class Laptop {
    protected String marca;
    protected String modelo;
    protected int anoFabricacion;
    protected String tipoProcessador;
    protected double tamanoPantalla;

    public Laptop(String marca, String modelo, int anoFabricacion,
                  String tipoProcessador, double tamanoPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.tipoProcessador = tipoProcessador;
        this.tamanoPantalla = tamanoPantalla;
    }

    public abstract void ejecutarPrueba();

    @Override
    public String toString() {
        return "Marca y Modelo: " + marca + " " + modelo + "\n" +
                "Año de Fabricacion: " + anoFabricacion + "\n" +
                "Procesador: " + tipoProcessador + "\n" +
                "Tamaño de la Pantalla: " + (int) tamanoPantalla;
    }
}
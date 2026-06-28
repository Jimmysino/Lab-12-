public class LaptopProfesional extends Laptop {

    public LaptopProfesional(String marca, String modelo, int anoFabricacion,
                             String tipoProcessador, double tamanoPantalla) {
        super(marca, modelo, anoFabricacion, tipoProcessador, tamanoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println(this.toString());
    }
}
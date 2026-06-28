
public class LaptopBasica extends Laptop {

    public LaptopBasica(String marca, String modelo, int anoFabricacion,
                        String tipoProcessador, double tamanoPantalla) {
        super(marca, modelo, anoFabricacion, tipoProcessador, tamanoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        System.out.println(this.toString());
    }
}
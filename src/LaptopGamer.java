
public class LaptopGamer extends Laptop {

    public LaptopGamer(String marca, String modelo, int anoFabricacion,
                       String tipoProcessador, double tamanoPantalla) {
        super(marca, modelo, anoFabricacion, tipoProcessador, tamanoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println(this.toString());
    }
}
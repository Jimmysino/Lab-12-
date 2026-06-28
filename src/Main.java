public class Main {

    public static void main(String[] args) {
        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS\n");

        LaptopFactory factory = new LaptopFactory();
        Laptop gamer = factory.crearLaptop("gamer");
        gamer.ejecutarPrueba();

        System.out.println();
        Laptop basica = factory.crearLaptop("basica");
        basica.ejecutarPrueba();

        System.out.println();
        Laptop profesional = factory.crearLaptop("profesional");
        profesional.ejecutarPrueba();

    }
}
public class LaptopFactory {

    public Laptop crearLaptop(String tipo) {
        switch (tipo.toLowerCase()) {
            case "gamer":
                return new LaptopGamer("Macbook air", "Macbook air", 2017,
                        "Silicon M1", 13);
            case "basica":
                return new LaptopBasica("Dell", "Latitude", 2020,
                        "intel core i7", 14);
            case "profesional":
                return new LaptopProfesional("Macbook", "Pro", 2022,
                        "Apple Silicon", 15);
            default:
                throw new IllegalArgumentException("Tipo de laptop no reconocido: " + tipo);
        }
    }
}
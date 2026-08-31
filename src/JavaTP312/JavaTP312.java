package JavaTP312;

public class JavaTP312 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(3);

        Esfera esfera = new Esfera();
        esfera.setRaio(5);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Volume da esfera: " + esfera.calcularVolume());
    }


}

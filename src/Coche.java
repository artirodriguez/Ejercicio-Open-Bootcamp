public class Coche {
    private int numeroPuertas;
    public void agregarPuerta() {
        this.numeroPuertas++;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("Mi coche tiene " + miCoche.numeroPuertas + " puertas.");
    }
}

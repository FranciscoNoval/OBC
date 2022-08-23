public class Tema3 {
    public static void main(String[] args) {
    int num1 = 12;
    int num2 = 24;
    int num3 = 36;

    suma(num1, num2, num3);
    Coche miCoche = new Coche();

    miCoche.masPuertas();
    miCoche.masPuertas();
    miCoche.masPuertas();
    System.out.println("Las puertas de mi coche son: "+miCoche.puertas);
    }
    public static void suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(resultado);
    }
}
class Coche {
    int puertas = 0;

    public void masPuertas(){
        this.puertas++;
    }

}
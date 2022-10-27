public class Main {
    public static void main(String[] args) {

        //Primera parte: funcion que suma tres numeros
        int resultado = suma(10, 20, 30);
        System.out.println("la suma de tres numeros = " + resultado);

        //Segunda parte: objeto que aumenta puertas a coche
        Coche miCoche = new Coche();
        miCoche.puertas();

        System.out.println("Numero de puertas: " + miCoche.numeroPuertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int numeroPuertas = 0;

    public void puertas() {
        this.numeroPuertas++;
    }
}
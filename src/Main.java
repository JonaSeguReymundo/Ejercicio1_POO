import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();

    }
    public static void Menu() {
        int opcion = 0;
        float a = 0;
        float b = 0;
        do {
            Scanner escaner = new Scanner(System.in);
            System.out.println("-----------Calculadora-----------------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = escaner.nextInt();

            if(opcion != 5){
                System.out.println("Ingrese el primer numero: ");
                a = escaner.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                b = escaner.nextFloat();
            }


            switch (opcion){
                case 1:
                    System.out.println("La suma de los dos numeros es: " + Suma(a,b));
                    break;
                case 2:
                    System.out.println("La resta de los dos numeros es: " + Resta(a,b));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los dos numeros es: " + Multiplicacion(a,b));
                    break;
                case 4:
                    if (b==0){
                        System.out.println("La division entre 0 no existe");
                    }else {
                        System.out.println("La division de los dos numeros es: " + Division(a,b));
                    }
                    break;
            }


        } while (opcion != 5);
    }
    public static float Suma(float a, float b){
        return a + b;
    }

    public static float Resta(float a, float b){
        return a - b;
    }

    public static float Multiplicacion(float a, float b){
        return a * b;
    }

    public static float Division(float a, float b){
        return a / b;
    }
}
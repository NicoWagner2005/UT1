package TA2;

public class UtilMath {

    //Ejercicio 1
    public static int factorial(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        } else if (n < 0){
            throw new IllegalArgumentException("El numero debe ser positivo");
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }


    // Ejercicio 2
    private static boolean isPrime(long n) {
        boolean prime = true;
        long i = 3;
        // Chequea solo hasta la raiz cuadrada de n, ya que si es mayor al a raiz cuadrada de n si es compuesto
        // ya deberia de tener un divisor distinto de 1 y n
        while (i <= Math.sqrt(n)) {
            //Si el resto de la division es 0 significa que i es divisor de n != 1 y n, entonces no es primo
            if (n % i == 0) {
                prime = false;
                break;
            }
            i += 2;
        }
        // Como no consideramos 2 en el loop lo tenemos en cuenta para el resultado
        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }

    public static int sumaPrimoONo(int numero) {
        int sum = 0;
        int i = 0;
        if (isPrime(numero)){
            while (i < numero){
                // Si 2 es divisor el numero es par, se suma y se pasa al siguiente par
                if (i % 2 == 0){
                    sum += i;
                }
                i++;
            }
        } else {
            while (i < numero){
                // Si 2 no es divisor es impar, se suma y pasa al siguiente impar
                if (i % 2 != 0){
                    sum += i;
                }
                i++;
            }
        }
        return sum;

    }
}



import TA2.UtilMath;
import TA3.ContadorPalabras;
import TA3.ResultadoDoble;

public class Main {

    public static void main(String[] args) {

        System.out.println(UtilMath.factorial(4));
        System.out.println(UtilMath.sumaPrimoONo(10));

        System.out.println(ContadorPalabras.contarPalabras("hola como estas a"));
        ResultadoDoble resultado = ContadorPalabras.cantidadConsVoc("buenas tardes");
        System.out.println(resultado.MostrarResultado());
    }

}

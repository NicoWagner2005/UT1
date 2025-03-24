package TA3;

public class ContadorPalabras {

    public static int contarPalabras(String frase) {

        int contador = 0;
        boolean esPalabra = false;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                esPalabra = true;
            } else if ((frase.charAt(i) == ' ')) {
                if (esPalabra) {
                    contador += 1;
                }
                esPalabra = false;
            }
        }
        if (esPalabra) {
            contador += 1;
        }
        return contador;
    }

    public static int contarPalabrasB(String frase, int x) {
        if (frase.length() < x) {
            return 0;
        } else {
            boolean esPalabra = false;
            int contador = 0;
            for (int i = 0; i < frase.length(); i++) {
                int largo = 0;
                while ((i < frase.length())) {

                    if (Character.isLetter(frase.charAt(i)))
                        largo += 1;

                    if ((frase.charAt(i) == ' ') && (largo >= x)) {
                        esPalabra = true;
                        contador += 1;

                    }
                    i += 1;

                }
            }
            if (esPalabra) {
                contador += 1;
            }
            return contador;
        }
    }

}

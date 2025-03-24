package TA3;



public class ContadorPalabras {

    public static int contarPalabras(String frase) {

        int contador = 0;
        boolean esPalabra = false;
        for (int i = 0; i < frase.length(); i++){
            if (Character.isLetter(frase.charAt(i))){
                esPalabra = true;
            }
            else if ((frase.charAt(i) == ' ')){
                if (esPalabra){
                    contador += 1;
                }
                esPalabra = false;
            }
        }
        if (esPalabra){
            contador += 1;
        }
        return contador;
    }

    public static ResultadoDoble cantidadConsVoc(String frase) {
        int cantVoc = 0;
        String vocales = "aeiouáéíóú";
        int cantCons = 0;
        boolean esPalabra = false;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (Character.isLetter(ch)) {
                esPalabra = true;
                if (vocales.contains(Character.toString(ch))) {
                    cantVoc++;
                } else {
                    cantCons++;
                }
            } else {
                if (ch == ' ' || i == frase.length() - 1) {
                    esPalabra = false;
                }
            }
        }
        return new ResultadoDoble(cantVoc, cantCons);
    }
    public static int contarPalabrasGrupoB(String frase, int largo) {

        int contador = 0;
        int contLonguitud = 0;
        boolean esPalabra = false;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                contLonguitud++;
                if (contLonguitud >= largo) {
                    esPalabra = true;
                }
            } else if ((frase.charAt(i) == ' ')) {
                if (esPalabra) {
                    contador += 1;
                }
                esPalabra = false;
                contLonguitud = 0;
            }
        }
        if (esPalabra) {
            contador += 1;
        }
        return contador;
    }
}



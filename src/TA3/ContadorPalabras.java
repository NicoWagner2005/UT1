package TA3;



public class ContadorPalabras {

    public static int contarPalabras(String frase) {

        int contador = 0;
        boolean esPalabra = false;
        for (int i = 0; i < frase.length(); i++){
            if (Character.isLetter(frase.charAt(i))){
                esPalabra = true;
            }
            if (frase.charAt(i) == ' ' || i == frase.length() - 1){
                if (esPalabra){
                    contador += 1;
                }
                esPalabra = false;
            }
        }
        return contador;
    }

}

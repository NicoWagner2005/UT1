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

}

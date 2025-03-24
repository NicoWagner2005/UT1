package TA3;


import java.io.*;
import java.util.ArrayList;

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

    public static ArrayList<String> leerArchivo(String filePath){
        ArrayList<String> lineasLeidas = new ArrayList<String>();
        FileReader fr;
        try {
            fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null){
                lineasLeidas.add(lineaActual);
                lineaActual = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo "+filePath);
            e.printStackTrace();
        } catch (IOException e)
        {
            System.out.println("Error al leer el archivo "+filePath);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");

        return lineasLeidas;
    }

}



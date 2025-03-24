package TA3;

public class ResultadoDoble {

    private final int vocales;
    private final int consonantes;

    public int getVocales(){
        return this.vocales;
    }

    public int getConsonantes(){
        return this.consonantes;
    }

    public ResultadoDoble(int vocales, int consonantes){
        this.vocales = vocales;
        this.consonantes = consonantes;
    }

    public String MostrarResultado (){
        return (getVocales() + "," + getConsonantes());
    }
}
package TA3;

public class ResultadoDoble {

    int[] resultado = new int[2];

    public ResultadoDoble(int[] resultado){
        this.resultado = resultado;
    }

    public void print(){
        System.out.println(resultado[0] + "," + resultado[1]);
    }
}
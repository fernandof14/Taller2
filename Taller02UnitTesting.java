public class Taller02UnitTesting {
    int dias=3;
    static double [][]sismos=new int[][];


    public void crearArreglo(){
        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                sismos[i][j]= Math.random()*10;
            }
        }
    }
    void imprimirSismos(){

        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                sismos[i][j]= Math.random()*10;
            }
        }
    }

    public static void main (String[] args){

    }
}

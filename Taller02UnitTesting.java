public class Taller02UnitTesting {
    int dias=3;


    void imprimirSismos(float[][] sismos){

        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                sismos[i][j]= 0.0;
            }
        }
    }

    public int contar(float[][] sismos){
        int AAA = 0;
        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                if(sismos[i][j] >= 5.5){
                    int AAA++;
                }
            }
        }
        return AAA;
    }

    public void alertaSismica(float [][] ){
        int esp1, esp2, esp3, esp4;
        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){


            }
        }
    }

    public static void main (String[] args){

    }
}
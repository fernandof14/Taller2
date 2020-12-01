public class Taller02UnitTesting {
    int dias=3;


    void imprimirSismos(float[][] sismos){

        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                sismos[i][j]= (float) 0.0;
            }
        }
    }

    public int contar(float[][] sismos){
        int AAA = 0;
        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                if(sismos[i][j] >= 5.5){
                    AAA++;
                }
            }
        }
        return AAA;
    }

    public void alertaSismica(float[][] sismos){
        int contadorSismico;
        int currentIntI;
        for (int i=0;sismos.length<i;i++){
            for (int j=0;sismos[i].length<j;j++){
                if(i == 0 && sismos[i][j] > 6.0){
                    contadorSismico = 1;
                }
                if(currentIntI == i && sismos[i][j] > 6.0){
                    contadorSismico++;
                }else{
                    contadorSismico = 0;
                }
                if(contadorSismico == 4){
                    System.out.println("¡Alerta! 4 sismos altos han ocurrido consecutivamente.");
                }

                currentIntI = i;
                int currentIntJ = j;
            }
        }
    }

    public static void main (String[] args){

    }
}
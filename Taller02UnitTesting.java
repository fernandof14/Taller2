import java.text.DecimalFormat;

public class Taller02UnitTesting {

    public static void main (String[] args){
        float [][]sismos= new float[3][8];
        crearArreglo(sismos);
        imprimirSismos(sismos);




    }


    static void crearArreglo(float [][]sismos){
        for (int i=0;i<sismos.length;i++){
            for (int j=0;j<sismos[i].length;j++){
                sismos[i][j]= (float)Math.random()*10;
            }
        }
    }
    static void imprimirSismos(float [][]sismos){
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i=0;i<sismos.length;i++){
            for (int j=0;j<sismos[i].length;j++){
                //System.out.printf("["+df.format(sismos[i][j])+"]");
                System.out.print("["+Math.round(sismos[i][j] * 10d) / 10d+"]");
            }System.out.println();
        }

    }


}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller02UnitTesting {
    float [][]sismos;
    public static void main (String[] args){
        Taller02UnitTesting obj=new Taller02UnitTesting();
        obj.sismos=crearArreglo();
        imprimirSismos(obj.sismos);
        //sismoMasFuerte(sismos);
        obj.menu();
 }


    static float [][] crearArreglo(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresar dias a analizar: ");

        int dias=entrada.nextInt();

        float [][]sismos= new float[dias][24];
        for (int i=0;i<sismos.length;i++){
            for (int j=0;j<sismos[i].length;j++){
                sismos[i][j]= (float)Math.random()*10;
                if(sismos[i][j]>=9.5){
                    sismos[i][j]-=0.5;}
            }
        }return sismos;
    }
    static void imprimirSismos(float [][]sismos){
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i=0;i<sismos.length;i++){
            for (int j=0;j<sismos[i].length;j++){
                System.out.print("["+Math.round(sismos[i][j] * 10d) / 10d+"]");
            }System.out.println();
        }

    }
     void menu(){
        int opcion=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Seleccionar Opcion: ");
        System.out.println("1. Sismo mas intenso\n2. Dias con mas de 5.5 richter\n3. ¿Hay alerta de escalada sísmica?\n4. Salir");
        opcion=teclado.nextInt();
        switch (opcion){
            case 1:
                sismoMasFuerte(sismos);
                break;
            case 2:
                masDe55(sismos);
                break;
            case 3:
                escaladaSismica(sismos);
                break;
            case 4:
                System.exit(0);
                break;
        }

    }

    private void escaladaSismica(float[][] sismos) {
        int contadorSismico = 0;
        int currentIntI = 0;
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


    private int masDe55(float[][] sismos) {
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



     float sismoMasFuerte(float [][]sismos) {
        float sisMayor=0;
        int dia=0; int hora=0;
        for (int i=0;i<sismos.length;i++){
            for (int j=0;j<sismos[i].length;j++){
                if(sismos[i][j]>sisMayor){
                    sisMayor=sismos[i][j];
                    dia=i;
                    hora=j;
                }
            }
        }
        System.out.println("El sismo mas fuerte fue a las 0"+hora+" horas el dia "+(dia+1)+" con una intesidad de "+sismos[dia][hora]+" richter");
        return sisMayor;
    }


}

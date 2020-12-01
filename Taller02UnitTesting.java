import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller02UnitTesting {

    public static void main (String[] args){
        float [][]sismos;

        sismos=crearArreglo();
        imprimirSismos(sismos);
        //sismoMasFuerte(sismos);
        //menu();
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
  /*  static void menu(){
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
                masDe55();
                break;
            case 3:
                escaladaSismica();
                break;
            case 4:
                System.exit(0);
                break;
        }

    }*/

    private void escaladaSismica() {
    }

    private void masDe55() {
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

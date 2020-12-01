import java.text.DecimalFormat;
import java.util.Scanner;

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
                if(sismos[i][j]>=9.5){
                    sismos[i][j]-=0.5;}
            }
        }
    }
    static void imprimirSismos(float [][]sismos){
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i=0;i<sismos.length;i++){
            for (int j=0;j<sismos[i].length;j++){
                System.out.print("["+Math.round(sismos[i][j] * 10d) / 10d+"]");
            }System.out.println();
        }

    }
    int menu(){
        int opcion=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Seleccionar Opcion: ");
        System.out.println("1. Sismo mas intenso\n2. Dias con mas de 5.5 richter\n3. ¿Hay alerta de escalada sísmica?\n4. Salir");
        opcion=teclado.nextInt();
        switch (opcion){
            case 1:
                sismoMasFuerte();
                break;
            case 2:
                masDe55();
                break;
            case 3:
                escaladaSismica();
                break;
        }
        return opcion;
    }

    private void escaladaSismica() {
    }

    private void masDe55() {
    }

    private void sismoMasFuerte() {
    }


}

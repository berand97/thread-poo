package unac.edu.co.poo2;

import java.util.Random;
import java.util.Scanner;

public class Main extends Thread {
     public static void main(String[] args) {
        Scanner thread  = new Scanner(System.in);// captura del teclado
        System.out.println("cuantos hilos quiere ejecutar");
        int h = thread.nextInt();//cantidad de hilos

        for(int i=1; i<=h; i++){
            new Thread("" + i ){
                public void run(){
                    int contador = 0;
                    for (int j=1; j<=10; j++){
                        contador = contador +1;
                        System.out.println("hilo: padre " + getName() + " Corriendo. el contador de incremento es " + contador);
                    }
                }
            }.start();
        }

    }
    
    /*-------------------------------------- 2 punto ----------------------------------------------------*/
   /*static int[] numeros;
   static int [] maximos;


    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;//cantidad de hilos
        int cantidad= 1000;
        int m = cantidad/n;
        numeros = new int[cantidad];
        maximos = new int [n];


        // verificar que los aleatorios esten uniformes y distribuidos
        for( int j=0 ; j<cantidad ; j++ ){
            numeros[j]=random.nextInt(500000);
        }
         //imprimirlos

        //for (int i=0 ; i<cantidad; i++){
        //    System.out.println(i+": " + numeros[i]);
        //}

        Thread [] hilos= new Thread[n];
        for (int i = 0; i < n; i++) {
            hilos[i] = new Thread("" + i){
                public void run() {
                    // System.out.println("hilo " + getName());
                    int contador = Integer.parseInt( getName());
                    int max = 0;
                    for (int j = contador*m ; j < (contador+1)*m; j++) {

                        if( numeros[j]>max){
                            max= numeros[j];
                        }
                    }
                    maximos[contador]= max;
                    System.out.println("hilo " + getName() + " " + maximos[contador]  );
                }
            };
                hilos[i].start();

        }
        try{
            for (int i = 0; i < n; i++) {
                hilos[i].join();

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        int max = 0;
        for (int j = 0 ; j <n ; j++) {

            if( maximos[j]>max){
                max= maximos[j];
            }
        }
        System.out.println("Maximo numero es  "  + max  );

    }
    */
}

//Yuletsy, Zamirt, cagueñas & andres
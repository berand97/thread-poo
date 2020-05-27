package unac.edu.co.poo2;

import java.util.Scanner;

public class Main extends Thread {

    public static void main(String[] args){
        //System.out.println(Thread.currentThread().getName());// hace referencia a la instancia que ejecuta
        Scanner thread  = new Scanner(System.in);// captura del teclado
        System.out.println("cuantos hilos quiere ejecutar");
        int h = thread.nextInt();//cantidad de hilos

        for(int i=1; i<=h; i++){
            new Thread("" + i ){
                public void run(){
                int contador = 0;
                for (int j=1; j<=100; j++){
                    contador = contador +1;
                    System.out.println("hilo: padre " + getName() + " Corriendo. el contador de incremento es " + contador);
                }
                }
            }.start();
        }

    }
}

//Yuletsy, Zamirt & andres
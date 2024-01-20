package src.boceto;
import java.util.Random;


public class Filosofo  implements Runnable{
    public void run(){
        String miNombre=Thread.currentThread().getName();
        Random generador=new Random();
        while (true){
            /* Comer*/
            /* Intentar coger palillos*/
            /* Si los coge:*/
            System.out.println(miNombre+" comiendo...");
            int milisegs=(1+generador.nextInt(5))*1000;
            esperarTiempoAzar(miNombre, milisegs);
            /* Pensando...*/
            //Recordemos soltar los palillos
            System.out.println(miNombre+"  pensando...");                           milisegs=(1+generador.nextInt(5))*1000;
            esperarTiempoAzar(miNombre, milisegs);
        }
    }

    private void esperarTiempoAzar(String miNombre, int milisegs) {
        try {
            Thread.sleep(milisegs);
        } catch (InterruptedException e) {
            System.out.println(
                    miNombre+" interrumpido!!. Saliendo...");
            return ;
        }
    }
}
import java.util.concurrent.Semaphore;

public class Cafetera {

    private static final Semaphore semaforo2 = new Semaphore(4, true);

    public static void Recoge(Huespedes huespedes){
        try {
            semaforo2.acquire();
            System.out.println("El " + huespedes.getName()+ " recoge su taza");
            int servir = (int) (Math.random()*(2000)+3000);
            Thread.sleep(servir);
            System.out.println("El "+ huespedes.getName() + " comienza su café");
            int beber = (int) (Math.random()*(2000)+2000);
            Thread.sleep(beber);
            semaforo2.release();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}

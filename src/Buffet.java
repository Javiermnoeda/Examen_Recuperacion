import java.util.concurrent.Semaphore;


public class Buffet {

    private static final Semaphore semaforo = new Semaphore(10, false);
    public static void entrada(Huespedes huespedes) {

        try {
            semaforo.acquire();
            System.out.println("El " + huespedes.getName() + " se sienta");
            Cafetera.Recoge(huespedes);
            semaforo.release();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}

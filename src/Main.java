
/*
1.20 huéspedes (hilos). Importa el orden de llegada, el primero en llegar es el primero en coger silla
2. Hay 10 sillas disponibles, los que llegan tienen que esperar. Cuando un huesped se sienta, escribir ("El cliente X se sienta")
3. Una vez se sienta, el cliente puede ir a servirse a la cafetera. La cafetera puede servir a un maximo de 4 personas,
cuando una persona recoge su taza, escribir ("El cliente X recoge su taza")
4. Una vez tiene la taza , tarda entre 3 y 5 segundos en servirse. Después vuelve a su sitio y se toma el café, después escribir ("El cliente X se toma el cafe")
 */



public class Main {
    public static void main (String [] args){
        Buffet buffet = new Buffet();

        for (int i=0;i<20;i++){
            Huespedes o = new Huespedes(buffet);
            o.setName("Cliente "+(i+1));
            o.start();
        }

    }


}

public class Huespedes extends Thread{

    Buffet buffet;

    public Huespedes(Buffet buffet){this.buffet = buffet;}
    public void run(){
        buffet.entrada(this);
    }

}

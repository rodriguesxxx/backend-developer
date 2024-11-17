public class ExempleThread {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();        
        
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();

        try {
            th1.join(); // Aguarda a thread 1 terminar
            th2.join(); // Aguarda a thread 2 terminar
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Ambas as threads terminaram.");

    }
}

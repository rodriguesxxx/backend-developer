public class MyThread extends Thread{
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + getId() + ": Contagem " + i);
            try {
                Thread.sleep(1000); // Aguarda 1 segundo
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}
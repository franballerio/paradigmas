package ej1;

public class Hilo extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Imprimiendo desde mi Thread.....");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

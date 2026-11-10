package ej1;

public class Runable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Imprimiendo desde mi Runnable.....");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

package ej1;

public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo();
        Thread hilo2 = new Thread(new Runable());

        hilo2.start();
        hilo1.start();
    }
}

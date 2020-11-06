package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args) {
        Carte carte = new Carte("Fratii Karamazov", "Feodor Dostoievski", 1880, 1200);
        Carte carte2 = new Carte("Fratii Karamazov", "Feodor Dostoievski", 1880, 1200);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.add(carte);
        biblioteca.add(new Carte("Procesul", "F. Kafka", 1910, 350));
        biblioteca.add(new Carte("Ender's Game", "Orscon Scott Card", 1954, 330));
		biblioteca.add(carte2);
		biblioteca.add(carte);

        biblioteca.sort();
        System.out.println(biblioteca);

        Thread thr = new MyThread();

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            }).start();
        }
    }
}

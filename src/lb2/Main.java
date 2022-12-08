package lb2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Consumer csr = new Consumer();
        Producer pdt = new Producer();
        Warehouse whs = new Warehouse(40);
        System.out.println("Размер склада: " + whs.getLimit());

        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pdt.producer(whs);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    csr.consumer(whs);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread_1.start();
        thread_2.start();
        thread_1.join();
        thread_2.join();
    }
}

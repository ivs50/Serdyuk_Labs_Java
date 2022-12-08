package lb2;

public class Consumer {
    public void consumer(Warehouse whs) throws InterruptedException {
        while (true) {
            synchronized (whs.getLock()) {
                while (whs.getQueue().size() == 0) {
                    whs.getLock().wait();
                }
                Products pdt = whs.getQueue().poll();
                System.out.println(pdt + "взять со склада");
                System.out.println("Количество продуктов на складе: " + whs.getQueue().size());
                whs.getLock().notify();
            }
            Thread.sleep(4000);
        }
    }
}

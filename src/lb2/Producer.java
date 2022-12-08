package lb2;

public class Producer {
    private int n = 0;
    public void producer(Warehouse whs) throws InterruptedException {
        while (true) {
            synchronized (whs.getLock()) {
                while (whs.getQueue().size() == whs.getLimit()) {
                    whs.getLock().wait();
                }
                Products pdt = new Products(n);
                whs.getQueue().offer(pdt);
                System.out.println("Произведён: " + pdt);
                n++;
                whs.getLock().notify();
            }
        }
    }
}

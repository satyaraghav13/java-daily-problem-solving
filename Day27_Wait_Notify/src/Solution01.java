class SharedResource {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait();   // Wait until data is consumed
            }
            data = value;
            System.out.println("Produced: " + data);
            hasData = true;
            notify();    // Notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        try {
            while (!hasData) {
                wait();   // Wait until data is produced
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notify();    // Notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Solution01 {
    public static void Solution01(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
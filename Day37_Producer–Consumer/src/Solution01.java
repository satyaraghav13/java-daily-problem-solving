class SharedResource {

    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait();   // wait until data is consumed
        }

        data = value;
        System.out.println("Produced: " + value);
        hasData = true;

        notify();   // notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData) {
            wait();   // wait until data is produced
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify();   // notify producer
        return data;
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Solution01 {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
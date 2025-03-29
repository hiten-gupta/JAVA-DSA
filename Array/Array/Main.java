import java.util.Scanner;

class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;
    private boolean stop;

    public IncrementThread(Counter counter) {
        this.counter = counter;
        this.stop = false;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            counter.increment();
            System.out.println("Incremented count: " + counter.getCount());
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DecrementThread extends Thread {
    private Counter counter;
    private boolean stop;

    public DecrementThread(Counter counter) {
        this.counter = counter;
        this.stop = false;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            counter.decrement();
            System.out.println("Decremented count: " + counter.getCount());
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();
        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        System.out.println("Press 's' to start counting, 'p' to pause counting, and 'q' to quit:");

        char input;
        boolean counting = false;

        while (true) {
            input = scanner.next().charAt(0);
            switch (input) {
                case 's':
                    if (!counting) {
                        incrementThread = new IncrementThread(counter);
                        decrementThread = new DecrementThread(counter);
                        incrementThread.start();
                        decrementThread.start();
                        counting = true;
                        System.out.println("Counting started...");
                    } else {
                        System.out.println("Counting already in progress...");
                    }
                    break;
                case 'p':
                    if (counting) {
                        incrementThread.setStop(true);
                        decrementThread.setStop(true);
                        counting = false;
                        System.out.println("Counting paused...");
                    } else {
                        System.out.println("No counting in progress to pause...");
                    }
                    break;
                case 'q':
                    if (counting) {
                        incrementThread.setStop(true);
                        decrementThread.setStop(true);
                    }
                    System.out.println("Quitting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Press 's' to start, 'p' to pause, or 'q' to quit.");
            }
        }
    }
}

package lesson11;

public class ThreadInterruption {
    public static void main(String[] args) {
        Thread longRunningThread = new Thread(new LongRunningTask(), "LongRunningThread");
        longRunningThread.start();

        // Wait for a while
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the long-running thread
        longRunningThread.interrupt();
    }

    static class LongRunningTask implements Runnable {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println(Thread.currentThread().getName() + ": Working...");
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + ": Interrupted, shutting down gracefully...");
                    // Clean up resources if needed
                    // Close files, release locks, etc.
                    break; // Exit the loop
                }
            }
        }
    }
}


class SleepingThread extends Thread {

    SleepingThread() { // non-default constructor
        super("" + ++threadCount) // Store the thread name
        this.start() // start this thread
    }

    String toString() {
        return "#${name}: ${countDown}"
    }

    void run() {
        while (true) {
            println this
            if (--countDown == 0) { 
                return
            }
            try {
                sleep(100) // 100 ms
            } catch (InterruptedException e) {
                throw new RuntimeException(e)
            }
        }
    }
    
// ---- properties -------------------------

    private countDown = 5

    private static threadCount = 0

}

for (i in 1..5) {
    new SleepingThread()
}
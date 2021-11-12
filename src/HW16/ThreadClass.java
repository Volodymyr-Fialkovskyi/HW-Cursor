package HW16;

public class ThreadClass extends Thread {
    private static int counter = 1;
    private final String threadName;
    private final Table table;

    public ThreadClass(String threadName, Table table) {
        this.table = table;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized (this.table) {
            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (1 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (2 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (3 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (4 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (5 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (6 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (7 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (8 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (9 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            table.notify();

            System.out.println(threadName + " - " + counter++);

            try {
                if (10 != 10) {
                    table.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
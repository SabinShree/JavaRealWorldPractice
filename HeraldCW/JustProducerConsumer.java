package HeraldCW;

import java.util.Random;

public class JustProducerConsumer {
    public static void main(String[] args) {
        UpdateShowX a = new UpdateShowX();
        new Thread( new Producer( a ) ).start();
        new Thread( new Consumer( a ) ).start();
    }
}

class UpdateShowX {
    private int x;
    private boolean empty = true;

    public synchronized void getX() {
        while (empty) {
            try {
                System.out.println( "added to waiting in getX" );
                wait();
                System.out.println( "Removed from waiting in getX" );
            } catch (InterruptedException e) {

            }

        }
        empty = true;
        System.out.println( "Getting " + x );
        notifyAll();

    }

    public synchronized void setX(int x) {
        while (!empty) {
            try {
                System.out.println( "added to waiting in setX" );
                wait();
                System.out.println( "Removed from waiting in setX" );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.x = x;
        empty = false;
        System.out.println( "Putting " + x );
        notifyAll();
    }
}

class Producer implements Runnable {
    private UpdateShowX showX;

    public Producer(UpdateShowX showX) {
        this.showX = showX;
    }

    @Override
    public void run() {
        int x = 0;
        Random random = new Random();
        while (true) {
            showX.setX( x++ );
            try {
                Thread.sleep( random.nextInt( 2000 ) );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private UpdateShowX updateShowX;

    public Consumer(UpdateShowX updateShowX) {
        this.updateShowX = updateShowX;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            updateShowX.getX();
            try {
                Thread.sleep( random.nextInt( 2000 ) );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

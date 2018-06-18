package org.academiadecodigo.bootcamp.concurrency;

import jdk.nashorn.api.tree.WhileLoopTree;
import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;

    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;

    }

    @Override
    public void run() {

        while (elementNum > 0) {
            System.out.println(Thread.currentThread().getName() + ": offering data to the queue");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            queue.offer(elementNum);
            elementNum--;
        }

        System.out.println();



    }

}



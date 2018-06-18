package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */

public class BQueue<T> {
    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */

    private int limit;
    private Queue<T> elements;
    private int size;


    public BQueue(int limit) {
        this.limit = limit;
        this.elements = new LinkedList<T>();

    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public synchronized void offer(T data) {

        while (size == limit) {
            System.out.println(Thread.currentThread().getName() + ": the queue is full, waiting for consumers");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        size++;
        this.elements.offer(data);
        System.out.println(Thread.currentThread().getName() + ": data is beeing offered to the consumer");
        notifyAll();
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public synchronized T poll() {

        while (size == 0) {
            System.out.println(Thread.currentThread().getName() + ": data was received by the producer");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + ": Done!");
        size--;
        notifyAll();
        return this.elements.poll();

    }


    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {

        System.out.println(Thread.currentThread().getName() + "gets the elements in the queue");
        return elements.size();


    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {

        System.out.println(Thread.currentThread().getName() + "gets the maximum number of the elements in the queue");
        return this.limit;

    }

}

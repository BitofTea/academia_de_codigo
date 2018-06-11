package org.academiadecodigo.bootcamp;

import java.util.Iterator;

/**
 * Created by ferrao on 30/05/16.
 */
public class RangeTest {

    public static void main(String[] args) {

        Range r = new Range(0, 20);

        System.out.println("--- USING ITERATOR ---");
        r.reversed();
        Iterator<Integer> it = r.iterator();

        while (it.hasNext()) {

            int i = it.next();

                System.out.println("Iterated: " + i);
            }



    }
}

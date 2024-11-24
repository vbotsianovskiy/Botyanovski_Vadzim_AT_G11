package main.java.cycletask;

import java.util.Random;

public class Array {
    public int[] array() {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(17);
        }
        return array;
    }
}

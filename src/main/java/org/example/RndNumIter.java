package org.example;


import java.util.Iterator;
import java.util.Random;

public class RndNumIter implements Iterator<Integer> {
    private final Random random;
    private final int min;
    private final int max;
    int currentNumber = 0;

    public RndNumIter(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        currentNumber++;
        return random.nextInt((this.max - this.min + 1)) + this.min;
    }

    @Override
    public void remove() {

    }
}

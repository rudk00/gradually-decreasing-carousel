package com.epam.rd.autotasks;

public class GraduallyDecreasingCarouselRun extends CarouselRun {
    private int decrement = 1;
    @Override
    public int next() {
        if (isFinished()) {
            return -1;
        }
        while (array[position] <= 0) {
            if (position >= array.length - 1) {
                position = 0;
                decrement++;
                continue;
            }
            position++;
        }
        int currentItem = array[position];
        array[position++] -= decrement;
        if (position == array.length) {
            position = 0;
            decrement++;
        }
        return currentItem;
    }
}

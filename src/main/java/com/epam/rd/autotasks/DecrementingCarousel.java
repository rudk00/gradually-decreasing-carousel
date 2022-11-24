package com.epam.rd.autotasks;

public class DecrementingCarousel {
    private final int capacity;
    static int [] arr ;
    int index = 0;
    boolean isRun = false;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public boolean addElement(int element){

        if (index < capacity && element > 0 && !isRun) {
            arr[index] = element;
            index++;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
}

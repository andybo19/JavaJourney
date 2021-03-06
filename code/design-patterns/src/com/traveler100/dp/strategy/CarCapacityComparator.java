package com.traveler100.dp.strategy;

import java.util.Comparator;

/**
 * @author 行百里者
 */
public class CarCapacityComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.capacity > o2.capacity) return -1;
        else if (o1.capacity < o2.capacity) return 1;
        return 0;
    }
}

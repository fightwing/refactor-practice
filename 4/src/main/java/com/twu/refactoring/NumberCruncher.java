package com.twu.refactoring;

import java.util.ArrayList;
import java.util.List;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public List<Integer> count(){
        int evenCount, oddCount, positiveCount, negativeCount;
        evenCount = oddCount = positiveCount = negativeCount =0;
        List<Integer> countList =new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) evenCount++;
            if (number % 2 == 1) oddCount++;
            if (number >= 0) positiveCount++;
            if (number < 0) negativeCount++;
        }
        countList.add(evenCount);
        countList.add(oddCount);
        countList.add(positiveCount);
        countList.add(negativeCount);
        return countList;
    }

    public int countEven() {
        int count = count().get(0);
        return count;
    }

    public int countOdd() {
        int count = count().get(1);
        return count;
    }

    public int countPositive() {
        int count = count().get(2);
        return count;
    }

    public int countNegative() {
        int count = count().get(3);
        return count;
    }
}

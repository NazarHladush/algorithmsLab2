package com.company;

import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    public int binarySearch(List<Hamster> hamsters, double key) {
        int startIdx = 0;
        int endIdx = hamsters.size() - 1;
        int count = 0;
        while (startIdx <= endIdx) {
            int mid = startIdx + (endIdx - startIdx) / 2;
            hamsters.sort(Comparator.comparingDouble((Hamster h) -> (h.getGreed() * mid+ + h.getDailyRate())));
            double sum = 0;
            for (int i = 0; i <= mid; i++) {
                sum += hamsters.get(i).getGreed()*mid + hamsters.get(i).getDailyRate();
            }
            // беремо праву частину
            if (sum <= key) {
                startIdx = mid + 1;
                count = mid+1;
            }
            // беремо ліву частину
            else if (sum > key) {
                endIdx = mid - 1;
            }
        }
        return count;
    }
}

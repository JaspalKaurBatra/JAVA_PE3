package com.stackroute;
import java.lang.*;


class AreConsecutive {
    boolean areConsecutive(int arr[], int n) {
        if (n < 1)
            return false;
        int min = getMin(arr, n);
        int max = getMax(arr, n);
        if (max - min + 1 == n) {
            boolean visited[] = new boolean[n];
            int i;
            for (i = 0; i < n; i++) {
                if (visited[arr[i] - min] != false)
                    return false;
                    visited[arr[i] - min] = true;
            }
            return true;
        }
        return false;
    }

    int getMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

}

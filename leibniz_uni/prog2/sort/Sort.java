package sort;

import java.util.*;

public class Sort {

// BUBBLESORT -------------------------------------------------------------------------------------------------------------------------------

    public static <T extends Comparable<T>> void bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

// QUICKSORT --------------------------------------------------------------------------------------------------------------------------------

    public static <T extends Comparable<T>> void quickSort(List<T> list) {
        qs(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<T>> void qs(List<T> values, int low, int high) {
        if (low < high) {
            int p = partition(values, low, high);
            qs(values, low, p - 1);
            qs(values, p + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(List<T> values, int low, int high) {
        T pivot = values.get(high);
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            if (values.get(j).compareTo(pivot) < 0) {
                T tmp = values.get(i);
                values.set(i, values.get(j));
                values.set(j, tmp);
                i++;
            }
        }
        T tmp = values.get(i);
        values.set(i, values.get(high));
        values.set(high, tmp);

        return i;
    }

// MERGESORT --------------------------------------------------------------------------------------------------------------------------------

    private static <T extends Comparable<T>> List<T> merge(final List<T> left, final List<T> right) {
        final List<T> merged = new ArrayList<T>();
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0).compareTo(right.get(0)) <= 0) {
                merged.add(left.remove(0));
            } else {
                merged.add(right.remove(0));
            }
        }
        merged.addAll(left);
        merged.addAll(right);
        return merged;
    }

    public static <T extends Comparable<T>> void mergeSort(List<T> input) {
        if (input.size() != 1) {
            final List<T> left = new ArrayList<T>();
            final List<T> right = new ArrayList<T>();
            boolean logicalSwitch = true;
            while (!input.isEmpty()) {
                if (logicalSwitch) {
                    left.add(input.remove(0));
                } else {
                    right.add(input.remove(0));
                }
                logicalSwitch = !logicalSwitch;
            }
            mergeSort(left);
            mergeSort(right);
            input.addAll(merge(left, right));
        }
    }

// INSERTIONSORT ----------------------------------------------------------------------------------------------------------------------------

    public static <T extends Comparable<T>> void insertionSort(List<T> list) {
        int i, j;
        for (i = 1; i < list.size(); i++) {
            T tmp = list.get(i);
            j = i;
            while ((j > 0) && (list.get(j - 1).compareTo(tmp) > 0)) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, tmp);
        }
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------------

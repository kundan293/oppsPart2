// Main.java

import JAva.Interface.Bubblesort;
import JAva.Interface.Sortable;

public class ArraySorting
{
    public static void main(String[] args) {
        int[] arr = {
                4,
                2,
                0,
                3,
                1,
                6,
                8
        };

        Sortable bubbleSort = new Bubblesort();
        bubbleSort.sort(arr);
        System.out.print("Bubble Sort: ");
        printArray(arr);

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.print("Selection Sort: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

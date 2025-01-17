import JAva.Interface.Sortable;

class SelectionSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
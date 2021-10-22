
public class QuickSort {

    public static int temp;

    public static void swap(int a[], int pos1, int pos2) {
        temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
    }

    public static int partition(int a[], int start, int end) {
        int partitionIndex = start;
        int pivot = a[end];

        for (int i = start; i < end; i++) {
            if (a[i] <= pivot) {
                swap(a, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(a, partitionIndex, end);

        return partitionIndex;
    }

    public static void quickSort(int a[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(a, start, end);
            quickSort(a, start, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, end);
        }

    }

    public static void main(String[] args) {
        int a[] = {7, 2, 1, 6, 8, 5, 3, 4};

        quickSort(a, 0, 7);

        for (int i : a) {
            System.out.println(i);
        }
    }

}

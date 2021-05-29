public class Code02_Sort {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void InsertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            while (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
                i--;
            }
        }
    }


    public static void SelectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int MinValueIndex = i;
            for (int j = i + 1; j < n; j++) {
                MinValueIndex = arr[j] < arr[MinValueIndex] ? j : MinValueIndex;
            }
            swap(arr, i, MinValueIndex);
        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 7, 8, 5, 4, 2, 6};
        SelectSort(arr);
        printArray(arr);
    }
}

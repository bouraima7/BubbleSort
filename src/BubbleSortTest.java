public class BubbleSortTest {
    BubbleSort bubble = new BubbleSort();

    public static void main(String[] args) {
        int[] array = {2, 4, 3, 1, 5, 6, 9, 7, 8, 10};
        System.out.println("Unsorted Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        // Send array to BubbleSort.sort to et sorted
        BubbleSort.sort(array);
        System.out.println();
        System.out.println("Sorted Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }


        // Send array to BubbleSort.sort to et sorted
    }

}

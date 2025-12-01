public class ArraySorting {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        qs.sort();
        bs.sort();

        Sorting quickSort = () -> System.out.println("Quick sorting");
        quickSort.sort();

        Sorting bubbleSort = () -> System.out.println("Bubble sorting");
        bubbleSort.sort();
    }


}

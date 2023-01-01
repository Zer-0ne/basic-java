public class App {
    public static void main(String[] args) throws Exception {
        SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);

        
		int n = arr.length;
		QuickSort q = new QuickSort();
		q.sort(arr, 0, n-1);
		System.out.println("sorted array");
		QuickSort.printArray(arr);

        
        int array[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Given Array");
		MergeSort.printArray(array);
		MergeSort ms = new MergeSort();
		ms.sort(array, 0, array.length-1);
		System.out.println("\nSorted array");
		MergeSort.printArray(arr);
    }
}

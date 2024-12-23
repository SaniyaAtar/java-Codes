import java.util.PriorityQueue;

public class KSortedArray {

    // Function to sort a k-sorted array
    public static void sortKSortedArray(int[] arr, int k) {
        // Create a min-heap (PriorityQueue) to store the first k+1 elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Step 1: Add the first k+1 elements to the heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }
        
        // Step 2: Process the rest of the elements in the array
        int index = 0;
        for (int i = k + 1; i < arr.length; i++) {
            // Pop the smallest element from the heap and place it at the correct index
            arr[index++] = minHeap.poll();
            // Push the next element from the array to the heap
            minHeap.add(arr[i]);
        }
        
        // Step 3: Pop the remaining elements from the heap and place them in the array
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        // Example array and k value
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        
        // Sorting the k-sorted array
        sortKSortedArray(arr, k);
        
        // Output the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

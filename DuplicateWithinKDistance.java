import java.util.HashSet;

public class DuplicateWithinKDistance {

    public static boolean containsDuplicateWithinK(int[] arr, int k) {
        // Create a HashSet to store elements within a window of size k
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If the element already exists in the set, return true
            if (set.contains(arr[i])) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);

            // If the size of the set exceeds k, remove the oldest element
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }

        // If no duplicates are found within k distance, return false
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1, 2, 3, 4};
        int k1 = 3;
        System.out.println(containsDuplicateWithinK(arr1, k1)); // Output: false

        int[] arr2 = {1, 2, 3, 1, 4, 5};
        int k2 = 3;
        System.out.println(containsDuplicateWithinK(arr2, k2)); // Output: true

        int[] arr3 = {6, 8, 4, 1, 8, 5, 7};
        int k3 = 3;
        System.out.println(containsDuplicateWithinK(arr3, k3)); // Output: true
    }
}

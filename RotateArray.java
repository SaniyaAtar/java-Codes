import java.util.*;

class RotateArray {
    void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        
        // Copy the last k elements to the beginning of the result array
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];//7-3+0=4  7-3+1=5 7-3+2=6
            System.out.println(result[i]);
        }
        System.out.println(Arrays.toString(result));

        // Copy the remaining elements to the result array
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            
            result[i] = nums[j];
            j++;
        }
        
        // Copy the result array back to the original array
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
class Solution {
        public void rotateLeft(int arr[], int d) {
            int n = arr.length;
    
            // Normalize d to handle cases where d > n
            d = d % n;
    
            // Reverse the first d elements
            reverse(arr, 0, d - 1);
    
            // Reverse the remaining n-d elements
            reverse(arr, d, n - 1);
    
            // Reverse the entire array
            reverse(arr, 0, n - 1);
        }
    
        // Helper method to reverse a section of the array
        private void reverse(int arr[], int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
    
    public static void main(String[] args) {
        RotateArray a = new RotateArray();
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        int c = 3;
        a.rotate(b, c);
        
        // Print the rotated array
        System.out.println(Arrays.toString(b));
    }
}

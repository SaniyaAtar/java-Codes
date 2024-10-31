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
    
    public static void main(String[] args) {
        RotateArray a = new RotateArray();
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        int c = 3;
        a.rotate(b, c);
        
        // Print the rotated array
        System.out.println(Arrays.toString(b));
    }
}

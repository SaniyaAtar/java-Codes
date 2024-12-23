import java.util.*;

public class MajorityElement {
    public static List<Integer> findMajorityElements(int[] arr) {
        int n = arr.length;
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        // Step 1: Find potential candidates
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        // Step 3: Sort the result
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        int[] arr2 = {1, 2, 3, 4, 5};
        
        System.out.println("Output for arr1: " + findMajorityElements(arr1));
        System.out.println("Output for arr2: " + findMajorityElements(arr2));
    }
}

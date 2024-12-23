import  java.util.HashMap;
class TwoSum{
    public static int[] twoSum(int[] num, int target){
        HashMap<Integer , Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            int complement = target - num[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(num[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }


}
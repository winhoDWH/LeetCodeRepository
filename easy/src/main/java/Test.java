public class Test {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        for (int i : Test.nextGreaterElement(nums1, nums2)){
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        //先进行排序
        sort(nums1);
        sort(nums2);
        int index = 0;
        int value = -1;
        for(int i =  0; i < nums1.length; i++){
            value = -1;
            for(; index < nums2.length; index++){
                if(nums1[i] < nums2[index]){
                    value = nums2[index];
                    break;
                }
            }
            result[i] = value;
        }
        return result;
    }

    private static void sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i;
            while(j >= 1 && temp < nums[j-1]){
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
        }
    }
}

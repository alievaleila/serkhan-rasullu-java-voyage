public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,1,0,0,0,1,1,1,1,0}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int sum=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                sum+=nums[i];
                if (max < sum) {
                    max=sum;
                }
            }else{
                sum=0;
            }
        }
        return max;
    }
}

public class FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{22,1,6,456,2}));

    }

    public static int findNumbers(int[] nums) {
        int count=0;

        for(int num:nums){
            String s=String.valueOf(num);
            if(s.length()%2==0){
                count++;
            }
        }
        return count;
    }
}

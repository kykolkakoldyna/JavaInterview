package julia.javaPractice;

public class SumOfAllDigitsNum {

    public static void main(String[] args) {
//        int n = 32;
//        String number = String.valueOf(n);
//        int[] nums = new int[number.length()];
//        for (int i = 0; i < number.length(); i++) {
//            nums[i] = Character.getNumericValue(number.charAt(i));
//        }
//        System.out.println(nums[0] + nums[1]);

        // Another better easier way

        int num = 32;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

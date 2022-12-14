package julia.javaPractice;

public class SumOf2Numbers {

    public static void main(String[] args) {
        int n = 32;
        String number = String.valueOf(n);
        int[] nums = new int[number.length()];


        for (int i = 0; i < number.length(); i++) {
            nums[i] = Character.getNumericValue(number.charAt(i));
        }
        System.out.println(nums[0]+nums[1]);
    }
}

package julia.javaPractice;
public class ReverseEachSentenceWord {
    public static void main(String[] args) {
        String str = "I love java";
        String result = "";
        String[] arr = str.split(" ");
        for (String eachWord : arr){
            int j = eachWord.length();
            while (j > 0){
                char ch = eachWord.charAt(j-1);
                result += ch;
                j--;
            }
        }
        System.out.println(result);
    }
}

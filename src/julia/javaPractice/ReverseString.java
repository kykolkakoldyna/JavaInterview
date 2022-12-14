package julia.javaPractice;
public class ReverseString {
    public static void main(String[] args) {
        String str = "java";
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}

/*
        Using String buffer not allowed on interview
        StringBuffer sb = new StringBuffer(str);
        String result = sb.reverse().toString();
        System.out.println(result);
*/


package julia.javaPractice;
public class ByteToString {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111};
        String str = new String(bytes);
        System.out.println(str);
    }
}

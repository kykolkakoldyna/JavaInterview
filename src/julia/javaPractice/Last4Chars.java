package julia.javaPractice;
public class Last4Chars {
    public static void main(String[] args) {
        String str = "sthsthstrhsrth";
        String result = str.substring(str.length()-4,str.length());
        System.out.println(result);
        }
    }

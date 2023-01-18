package julia.javaPractice;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        int charV=0;
        int charC=0;
        String str2 = "I love java";
        String fin = str2.toLowerCase().replaceAll(" ", "");
        for (int i = 0; i < fin.length(); i++) {
            if (fin.charAt(i) == 'a' || fin.charAt(i) == 'o' || fin.charAt(i) == 'i' || fin.charAt(i) == 'e'){
                charV++;
            }else if(fin.charAt(i) >= 'a' && fin.charAt(i) <= 'z'){
                charC++;
            }
        }
        System.out.println("count c " +charC);
        System.out.println("count v " +charV);
    }
}

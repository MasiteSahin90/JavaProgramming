package day20_Arrays;

public class AppearTwice {
    public static void main(String[] args) {

        char[] chars = {'a','b','a'};
        for (int j = 0; j < chars.length ; j++) {

            char ch = chars[j];
            int freq = 0;

            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==ch){
                    freq++;
                }
            }
            if(freq == 2){
                System.out.println("ch = " + ch);
            }
        }

    }
}

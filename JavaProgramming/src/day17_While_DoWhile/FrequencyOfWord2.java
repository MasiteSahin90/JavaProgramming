package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Cat Dog Cat cat CAT CAt";
        String str1 = "Cat";
        int frequency = 0;

        for (int i = 0; i < str.length() -2 ; i++) {
            String eachSub = str.substring(i,i+3);
            if(eachSub.equalsIgnoreCase(str1)){
                frequency ++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}

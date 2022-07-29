package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "JavaJavaJavaJava";
        String str1 = "Java";
        int frequency = 0;

        for (int i = 0; i < str.length() -3 ; i++) {
          String eachSub = str.substring(i,i+4);
          if(eachSub.equals(str1)){
              frequency ++;
          }
        }
        System.out.println("frequency = " + frequency);
    }
}

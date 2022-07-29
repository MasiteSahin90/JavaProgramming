package day24_CustomMethods_Return;

public class Frequency {

    public static void main(String[] args) {
        /*
        create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
         */
        String str = "masuk masuk saci saci saci";

        int result = frequency(str,"saci");

        System.out.println(result);

    }

   public static int frequency (String str , String word ){

       int count = 0 ;

       while (str.contains(word)){
           str = str.replaceFirst(word,"");
           count++;
       }
    return count;
    }




}

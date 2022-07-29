package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,5,5,5,5,6,7,8,9,10};

        int count = frequencyOfElement(array,5);

        System.out.println("count = " + count);
    }
    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;

        for (int each : array) {

            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;

        for (double each : array) {

            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;

        for (char each : array) {

            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {

        int count = 0;

        for (String each : array) {

            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }

}

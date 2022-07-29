package day20_Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] names = {"ayse","Ali","tufan","faruk"};

        for (int i = 0; i < names.length; i++) {
            String initials = names[i].charAt(0) + "";
            System.out.println("initials = " + initials);
        }
    }
}

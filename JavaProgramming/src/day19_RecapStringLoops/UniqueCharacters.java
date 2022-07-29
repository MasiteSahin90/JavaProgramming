package day19_RecapStringLoops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabccc";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch =  str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }

            }
            if(count==1){
                result += ch;
                //if(count!=1)
                //continue
            }
        }
        System.out.println(result);


    }
}

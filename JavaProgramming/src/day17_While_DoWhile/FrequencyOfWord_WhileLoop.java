package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String sentece = " cat cat cat cat dog dog cat cat cat";
            sentece = sentece.toLowerCase();
        int coutCat = 0;

        while (sentece.contains("cat")){
            sentece = sentece.replaceFirst("cat","");
            coutCat++;
        }
        System.out.println("coutCat = " + coutCat);


        System.out.println("---------------------------");

        String s = "java java java phyton phyton phyton java";
            s= s.toLowerCase();
        int countJava=0;
        int countPhyton = 0;

        while(s.contains("java") || s.contains("phyton")){
            if(s.contains("java")){
                s= s.replaceFirst("java", "");
                countJava++;
            }
            if(s.contains("phyton")){
                s= s.replaceFirst("phyton", "");
                countPhyton++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);


    }
}

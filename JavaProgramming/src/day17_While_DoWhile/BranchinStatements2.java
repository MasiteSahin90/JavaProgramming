package day17_While_DoWhile;

public class BranchinStatements2 {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){

            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------");
        for (int j = 1; j<=10; j++) {

            if(j%2 != 0){
                continue;
            }
            System.out.print(j + " ");
        }
        
    }
}

package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String word = " ";

        boolean s = word.isEmpty();
        System.out.println("s = " + s);
        boolean s1 = word.isBlank();
        System.out.println("s1 = " + s1);

        System.out.println("--------------------");

        String a1 = "CYDEO";
        String a2 = "cydeo";

        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));

        System.out.println("yES".equals("Yes"));
        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("--------------------");

        String sentence = "my faourite programme is java";
        boolean hascsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("java");
        boolean hasJava2 = sentence.contains("Java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println("hascsharp = " + hascsharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("--------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.contains("Java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));
        System.out.println(input1.toLowerCase().contains("java"));

        String repeat = "masuk ";
        repeat = repeat.repeat(13);
        System.out.println("repeat = " + repeat);

        String m = "Wooden Spoon";
        boolean x = m.startsWith("Woo");
        boolean y = m.toLowerCase().endsWith("spoon");

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}

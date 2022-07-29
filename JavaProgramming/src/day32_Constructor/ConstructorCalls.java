package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default cons");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println(" cons with int arg");
    }
    public ConstructorCalls(String str){
        this(10);
        System.out.println(" cons with int arg");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("-----------------------");
        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("------------------------");
        ConstructorCalls obj3 = new ConstructorCalls("masite");



    }

}

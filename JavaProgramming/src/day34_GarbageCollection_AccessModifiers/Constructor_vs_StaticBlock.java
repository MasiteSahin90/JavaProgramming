package day34_GarbageCollection_AccessModifiers;

import day31_Constructors.CapitalOne;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");

        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }
}

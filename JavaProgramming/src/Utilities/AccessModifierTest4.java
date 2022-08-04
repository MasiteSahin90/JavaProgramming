package Utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {

    public static void main(String[] args) {
        //System.out.println(ProtectedAccessModifier.name1); //default is not visible outside the package
        System.out.println(ProtectedAccessModifier.name2);  //protected is visible outside the package

        //ProtectedAccessModifier.method1(); // default not visible
    ProtectedAccessModifier.method2(); // protected visible in sub classes








    }






}

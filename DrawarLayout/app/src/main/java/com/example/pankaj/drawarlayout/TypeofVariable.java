package com.example.pankaj.drawarlayout;

/**
 * Created by Pankaj on 9/23/2015.
 */
public class TypeofVariable { // class open

    public int i = 10 , j = 20; // instance variable
    public static int m = 30, n = 40; // class variable must be define using static key word.

    public void variableLocal() {
        int x = 5; // local variable
        for(int a = 1; a <= 5; a++ ) { // a is range variable because it is not accessible out side the loop body
            System.out.println(a+" " );
        }
        System.out.println(x+ " "); // accessible only inside method

    }
    public int parameterVariable(int p, int q){
        return p+q;
    }
} // class close
class VariableTest {
    public static void main(String[ ] args){
        TypeofVariable t = new TypeofVariable();
        System.out.println(t.i); // Instance variable accessible using object
        System.out.println(TypeofVariable.m); // class variable accessible using class
    }
}
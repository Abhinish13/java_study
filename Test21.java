package com.t4tektutorials.abhinish.raj;

public class Test21 {

    public static void main (String args[]) {

        int a = 99 ;
        int b = a ;
        System.out.println(a);
        System.out.println(b);
        b = 88 ;
        System.out.println(a);
        System.out.println(b);
    }
}

// All instance variable have there memory allocated separately in the heap
// Each variable will have there memory block separate i.e when we change the value of one variable will not affect the value of other variable
// Output of the program : 99
//                         99
//                         99
//                         88

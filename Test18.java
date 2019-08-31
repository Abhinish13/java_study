package com.t4tektutorials.abhinish.raj;

public class Test18 {
    public static void main (String args[]){
        final int ab;
        ab = 12;
  //      ab = 14;
        // Compile time error
// java : variable ab might already have been assigned
        System.out.println(ab + 10);
        System.out.println(ab);
    }
}

// Final is a keyword used for the declaring the constant
// its value cannot be changed once it is declared
// Out put of the program : 22
                    //      12
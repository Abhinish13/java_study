package com.t4tektutorials.abhinish.raj;

public class Test19{
    static String name;
    public static void main(String args[]){
        //String name;
        // Compile time error
        //java : variable name might not have been initialized
        //Error:(7, 28) java: variable name might not have been initialized
        System.out.println(name);
    }
}

// Static is the keyword used for defining the global variable whose memory allocation will happens once when the program will start the execution.
// static is accessible through out the program scope
// static variable are initialized with default values in the start of program
//Output of the program is : null
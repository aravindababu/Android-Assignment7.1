/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inttostring;

/**
 *
 * @author user2
 */
public class IntToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaring the Integer Variable
        int IntegerVariable = 50;
        
        //Declaring the String Variable
        String StringVariable;
        
        //Converting the Integer to String Using .toString inbuilt Java method availabe
        StringVariable = Integer.toString(IntegerVariable);
        
        //Printing the Integer Variable just for comparison
        System.out.println("Integer variable : " + IntegerVariable);
        
        //Printing the String Variable
        System.out.println("String Variable : " + StringVariable);
        
    }
}
